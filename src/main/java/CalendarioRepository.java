import java.util.HashMap;
import java.util.Map;

public class CalendarioRepository {

    // Crear una lista de calendarios y usuarios
    private Map<Integer, Calendario> calendarios = new HashMap<>();

    public CalendarioRepository(){
        // Se crean calendarios por defecto para los usuarios que tambien estan registrados por defecto
        Calendario calendario1 = new Calendario();
        Fecha fecha1 = new Fecha();
        Evento evento1 = new Recordatorio(new Contenido("Evento 1", "Descripcion 1"), new Hora(10,15));
        Evento evento2 = new Reunion(new Contenido("Evento 2", "Descripcion 2"), new Hora(12,30));
        fecha1.anadirEventoAFecha(evento1);
        fecha1.anadirEventoAFecha(evento2);
        calendario1.anadirFechaAlCalendario(fecha1);
        //Se agregan los calendarios al repositorio
        calendarios.put(1,calendario1);

        Calendario calendario2 = new Calendario();
        Fecha fecha2 = new Fecha();
        Evento evento3 = new Recordatorio(new Contenido("Evento 3", "Descripcion 3"), new Hora(11,25));
        Evento evento4 = new Reunion(new Contenido("Evento 4", "Descripcion 4"), new Hora(13,45));
        fecha2.anadirEventoAFecha(evento3);
        fecha2.anadirEventoAFecha(evento4);
        calendario2.anadirFechaAlCalendario(fecha2);
        //Se agregan los calendarios al repositorio
        calendarios.put(2,calendario2);

    }
    // Sugerencia crear una clase AsociacionCalendarioUsuario
    //David: nel prro, no creo que sea necesario

    public Calendario buscarCalendario(User user){
        try{
            return calendarios.get(user.getId());
        }catch (Exception e){
            return null;
        }
    }

    public Calendario guardar(Calendario calendario, User user){
        calendarios.put(user.getId(),calendario);
        return calendarios.get(user.getId());
    }

}


