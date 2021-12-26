import java.util.Scanner;

public class Hora {

    private int hora;
    private int minuto;

    public Hora(){}

    public Hora(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
    }

    public void registrarHora(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Selecciona la hora(00:00 - 23:59): ");
        String arrHora [];
        arrHora = sc.next().split(":");
        int hora = Integer.parseInt(arrHora[0]);
        int minuto = Integer.parseInt(arrHora[1]);
        this.hora=hora;
        this.minuto=minuto;
    }


    public String mostrar(){
        return "Hora: "+ this.hora + ":" + this.minuto;
    }

}