import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MenuAgendaTest extends TestCase {

    @Test
    public void give_an_user_when_change_name_user_then_return_true() {
        AgendaApplication aA = Mockito.mock((AgendaApplication.class));
        MenuAgenda mA = new MenuAgenda(aA);

    }


}