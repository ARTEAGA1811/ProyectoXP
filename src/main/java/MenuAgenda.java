import java.util.Scanner;

public class MenuAgenda {

    private Calendario calendario;
    private User user;
    private AgendaApplication agendaApplication;


    public MenuAgenda(AgendaApplication agendaApplication) {
        this.agendaApplication = agendaApplication;
    }

    public void iniciar(Calendario calendario, User user) {
        this.calendario = calendario;
        if (calendario==null)
            this.calendario = new Calendario();
        this.user = user;
        System.out.println("Bienvenido a la última tecnología en agendas con MiAgendaEPN :o");
        while(true){
            desplegarOpciones();
        }
    }

    public void desplegarOpciones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\tBienvenido a tu Agenda\n");
        System.out.println("Selecciona una opción");
        System.out.println("\t1. Agendar \n\t2. Mostrar Agenda \n\t3. Cerrar Sesion");

        int opcion = sc.nextInt();

        if (opcion != 1 & opcion != 2 & opcion != 3) {
            System.out.println("AVISO: Actualmente no tenemos esa Opcion");
            desplegarOpciones();
        }else{
            seleccionarOpcion(opcion);
        }
    }

    public void seleccionarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("\t\tEscoje un Evento:");
                new Evento().agendar(calendario);
                // NUEVO
                CalendarioRepository calendarioRepository = new CalendarioRepository();
                calendarioRepository.guardar(calendario,user);
                break;

            case 2:
                calendario.mostrarAgenda();
                break;

            case 3:
                agendaApplication.desplegarOpciones();

        }
    }


}

