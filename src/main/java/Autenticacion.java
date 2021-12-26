import java.util.Scanner;

public class Autenticacion {

    private UserRepository userRepository;
    private Scanner sc;

    public Autenticacion(UserRepository userRepository,Scanner sc){
        // Es más fácil hacer mocking en el testing al mandar el repositorio en el constructor
        this.userRepository=userRepository;
        this.sc=sc;
    }

    public User iniciarAutenticacion(){

        String[] credencialesUsuario = solicitarCredencialesPorConsola();

        User user = userRepository.buscarUsuario(new User(credencialesUsuario[0], credencialesUsuario[1]));

        // Si user es null entonces no se encontro el usuario porque no existe o ingreso mal
        // las credenciales.
        if(user == null){
            System.out.println("No estas registrado");
            return null;
        }
        return user;
    }

    private String[] solicitarCredencialesPorConsola(){

        System.out.println("Usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Clave: ");
        String clave = sc.nextLine();

        return new String[]{usuario, clave};
    }

}

