import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class UserRepositoryParameterizedTest {
    private UserRepository userRepository;
    private String nombreUsuario, clave;
    private boolean expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{"david","arteaga",true});
        objects.add(new Object[]{"andrea","123",true});
        objects.add(new Object[]{"carlos","password1",true});
        objects.add(new Object[]{"pepe","yosoyppee",true});
        return objects;
    }

    public UserRepositoryParameterizedTest(String username, String password, boolean expected){
        this.nombreUsuario = username;
        this.clave = password;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        System.out.println("setUp()");
        userRepository = new UserRepository();

        //Primero creamos usuarios iniciales
        User user1 = new User("david","arteaga");
        User user2 = new User("andrea","123");
        User user3 = new User("carlos","password1");
        User user4 = new User("pepe","yosoyppee");
        userRepository.guardarUsuario(user1);
        userRepository.guardarUsuario(user2);
        userRepository.guardarUsuario(user3);
        userRepository.guardarUsuario(user4);

    }

    @Test
    public void given_parameters_when_deleteUser_then_return_false(){
        User user = userRepository.buscarUsuario(nombreUsuario, clave);
        boolean actual = userRepository.eliminarPerfil(user);
        assertEquals(expected, actual);
    }



}