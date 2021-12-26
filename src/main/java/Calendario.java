import java.util.ArrayList;
import java.util.List;

public class Calendario {

    private List<Fecha> fechas;

    public Calendario(){ fechas=new ArrayList<>();}

    public void mostrarAgenda(){
        System.out.println("\nSe muestra su agenda: ");
        for(Fecha fecha: fechas){
            System.out.println("*************************");
            fecha.mostrar();
            for(Evento evento: fecha.getEventos()){
                System.out.println("-------------------------");
                evento.mostrar();
            }
        }
        System.out.println("*************************\n");
    }

    public Fecha anadirFechaAlCalendario(Fecha fecha){
        int indiceFecha = getIndiceDeLaFecha(fecha);
        //Si no existe la fecha (-1) , se agrega la fecha a la listaFechas.
        if(indiceFecha == -1){
            fechas.add(fecha);
            indiceFecha = fechas.size()-1;
        }
        //Este metodo retorna la fecha que esta guardada en la lista.
        return fechas.get(indiceFecha);
    }

    public int getIndiceDeLaFecha(Fecha miFecha){
        int indiceFecha = -1;
        for(int i = 0; i<fechas.size(); i++){
            if(fechas.get(i).equals(miFecha)){
                indiceFecha = i;
                break;
            }
        }
        return indiceFecha;
    }

    public List<Fecha> getFechas() {
        return fechas;
    }

    public void setFechas(List<Fecha> fechas) {
        this.fechas = fechas;
    }
}
