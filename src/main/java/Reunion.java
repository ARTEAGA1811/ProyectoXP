public class Reunion extends Evento {

    public Reunion(Contenido miContenido, Hora miHora) {
        super(miContenido, miHora, "Reunión");
    }

    @Override
    public void agendar(Calendario miCalendario) {
        super.agendar(miCalendario);
    }

    public void mostrar() {
        super.mostrar();
    }

}
