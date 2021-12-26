import org.junit.Test;
import org.mockito.Mockito;


import static org.junit.Assert.*;

public class iUserRepositoryTest {

    @Test
    public void given_an_user_when_delete_then_return_true(){

        //Primero se crea un usuario
        User user = new User("david", "arteaga");

        iUserRepository usRep = Mockito.mock(iUserRepository.class);
        Mockito.when(usRep.eliminarPerfil(user)).thenReturn(true);
        assertEquals(true, usRep.eliminarPerfil(user));
    }

}