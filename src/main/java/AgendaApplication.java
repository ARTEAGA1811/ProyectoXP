import java.util.Scanner;

public class AgendaApplication {

    private MenuAgenda menuAgenda;
    private Autenticacion autenticacion;
    private UserRepository userRepository;
    private CalendarioRepository calendarioRepository;
    private User user;


    public AgendaApplication(){
        this.userRepository = new UserRepository();
        calendarioRepository = new CalendarioRepository();
        Scanner scanner = new Scanner(System.in);
        this.autenticacion = new Autenticacion(userRepository, scanner);
        menuAgenda = new MenuAgenda(this);
    }

    public AgendaApplication(CalendarioRepository calendarioRepository){
        this.calendarioRepository=calendarioRepository;
    }

    public void iniciarAplicacion(){
        desplegarOpciones();

        // Validar

    }

    public void desplegarOpciones(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\tBienvenido a tu Agenda\n");
        System.out.println("Selecciona una opción");
        System.out.println("\t1. LOGIN \n\t2. Crear Usuario \n\t3. Eliminar Perfil \n\t4. Salir");

        int opcion = sc.nextInt();

        if (opcion != 1 & opcion != 2 & opcion != 3 & opcion != 4) {
            System.out.println("AVISO: Actualmente no tenemos esa Opcion");
            desplegarOpciones();
        }else{
            seleccionarOpcion(opcion);
        }
    }

    private void seleccionarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                User user = autenticacion.iniciarAutenticacion();
                if(user == null){
                    desplegarOpciones();
                }else{
                    Calendario calendario = calendarioRepository.buscarCalendario(user);
                    menuAgenda.iniciar(calendario,user);
                }

                break;

            case 2:
                Scanner sc  = new Scanner(System.in);
                System.out.println("Ingresa tu usario: ");
                String usuraio = sc.nextLine();
                System.out.println("Ingresa tu clave ");
                String clave = sc.nextLine();
                user = new User(usuraio,clave);
                if(userRepository.guardarUsuario(user) == null){
                    System.out.println("algo salio mal");
                    desplegarOpciones();
                }
                else {
                    Calendario calendario = new Calendario();
                    calendarioRepository.guardar(calendario,user);
                    System.out.println("Usuario creado con exito");
                    desplegarOpciones();
                }


                break;

            case 3:
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Ingresa tu usuario: ");
                String usuraio2 = sc1.nextLine();
                System.out.println("Ingresa tu clave ");
                String clave2 = sc1.nextLine();
                user = new User(usuraio2,clave2);
                userRepository.eliminarPerfil(user);
                desplegarOpciones();
                break;
            case 4:
                System.out.println("\t\tAdios!");
                System.exit(0);
        }

    }

}
