import java.util.Scanner;

public class Evento {

    private Contenido miContenido;
    private Hora miHora;
    private String tipoEvento;

    public Evento(){}
    public Evento(Contenido miContenido, Hora miHora, String tipoEvento) {
        this.miContenido = miContenido;
        this.miHora = miHora;
        this.tipoEvento = tipoEvento;
    }

    public void agendar(Calendario calendario){

        System.out.println("Ha seleccionado la opción para agendar");

        Fecha miFecha = new Fecha();
        miFecha.registrarFecha();

        //Se coloca miFecha en apuntando a una posicion en el calendario.
        miFecha = calendario.anadirFechaAlCalendario(miFecha);

        Hora miHora = new Hora();
        miHora.registrarHora();

        Evento miEvento = registrarEvento(miHora);

        miFecha.anadirEventoAFecha(miEvento);

    }

    public Evento registrarEvento(Hora miHora){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona el tipo de evento que deseas agendar:");
        System.out.println("\t1. Recordatorio\n\t2. Reunión\n\t3. Tarea");
        int numeroEvento = sc.nextInt();

        return seleccionarOpcion(numeroEvento,miHora);

    }

    public Evento seleccionarOpcion(int numeroEvento, Hora miHora){

        Contenido miContenido = new Contenido();
        miContenido.registrarContenido();
        switch (numeroEvento){
            case 1:
                return new Recordatorio(miContenido,miHora);
            case 2:
                return new Reunion(miContenido,miHora);
            case 3:
                return new Tarea(miContenido,miHora);
        }
        return null;
    }

    public void mostrar(){
        System.out.println("Tipo: "+tipoEvento+"\n"+miHora.mostrar()+"\n"+miContenido.mostrar());
    }

    //Getter and Setter
    public Contenido getMiContenido() {
        return miContenido;
    }

    public void setMiContenido(Contenido miContenido) {
        this.miContenido = miContenido;
    }

    public Hora getMiHora() {
        return miHora;
    }

    public void setMiHora(Hora miHora) {
        this.miHora = miHora;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

}
