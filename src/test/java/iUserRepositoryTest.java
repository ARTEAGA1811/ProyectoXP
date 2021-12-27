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

    @Test
    public void given_an_user_and_name_changeTheUsername_then_return_true(){

        //Primero se crea un usuario
        User user = new User("david", "david1811");
        String newUsername = "Mittsaker";
        iUserRepository usRep = Mockito.mock(iUserRepository.class);
        Mockito.when(usRep.cambiarNombreDeUsuario(user, "Mittsaker")).thenReturn(true);
        assertTrue(usRep.cambiarNombreDeUsuario(user, newUsername));
    }

    @Test
    public void given_an_user_and_EmptyName_changeTheUsername_then_return_false(){

        //Primero se crea un usuario
        User user = new User("david", "david1811");
        String newUsername = "";
        iUserRepository usRep = Mockito.mock(iUserRepository.class);
        Mockito.when(usRep.cambiarNombreDeUsuario(user, "")).thenReturn(false);

        assertFalse(usRep.cambiarNombreDeUsuario(user, newUsername));
    }

}