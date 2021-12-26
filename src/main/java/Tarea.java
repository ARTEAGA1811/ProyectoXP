public class Tarea extends Evento{

    public Tarea(Contenido miContenido, Hora miHora) {
        super(miContenido, miHora, "Tarea");
    }

    @Override
    public void agendar(Calendario miCalendario) {
        super.agendar(miCalendario);
    }

    public void mostrar() {
        super.mostrar();
    }

}
