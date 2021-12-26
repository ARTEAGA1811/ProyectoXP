import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fecha {

    private int dia;
    private int mes;
    private List<Evento> eventos;

    public Fecha(){eventos=new ArrayList<>();}

    public void registrarFecha(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Selecciona el día (1-31): ");
        int miDia = sc.nextInt();
        System.out.print("Selecciona el mes (1-12): ");
        int miMes = sc.nextInt();
        this.dia=miDia;
        this.mes=miMes;
    }

    public void anadirEventoAFecha(Evento evento){
        eventos.add(evento);
    }



    public void mostrar(){
        System.out.println("\tDía: "+this.dia+"| Mes: "+this.mes);
    }

    //Getter and Setter.
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setListaEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public boolean equals(Object obj) {
        Fecha fecha = (Fecha) obj;
        return this.mes==fecha.getMes() && this.dia==fecha.getDia();
    }
}
