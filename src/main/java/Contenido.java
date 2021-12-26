import java.util.Scanner;

public class Contenido {

    private String titulo;
    private String cuerpo;

    public Contenido(){}
    public Contenido(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public void registrarContenido(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el título: ");
        String miTitulo = sc.nextLine();
        System.out.println("Ingresa el mensaje: ");
        String miMensaje = sc.nextLine();
        this.titulo=miTitulo;
        this.cuerpo=miMensaje;
    }

    public String mostrar(){
        return "Titulo: "+this.titulo+"\nCuerpo: "+this.cuerpo;
    }

}
