public class Recordatorio extends Evento{

    public Recordatorio(Contenido miContenido, Hora miHora) {
        super(miContenido, miHora,"Recordatorio");
    }

    @Override
    public void agendar(Calendario miCalendario) {
        super.agendar(miCalendario);
    }

    public void mostrar() {
        super.mostrar();
    }

}
