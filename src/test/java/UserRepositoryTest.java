import org.junit.*;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.junit.Assert.*;


public class UserRepositoryTest {
    UserRepository userRepository;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp() {
        System.out.println("setUp()");
        userRepository = new UserRepository();
        //Primero creamos un usuario
        User user = new User("david", "arteaga");
        userRepository.guardarUsuario(user);

        User user2 = new User("timo", "teo");
        userRepository.guardarUsuario(user2);

    }

    @Test
    public void given_an_user_when_delete_then_return_true() {
        System.out.println("Test 1");
        User user = userRepository.buscarUsuario("david", "arteaga");
        assertEquals(true, userRepository.eliminarPerfil(user));
    }

    //historia de usuario: cambiar el nombre del usuario

    @Test
    public void given_an_user_when_change_user_name_then_return_true() {
        System.out.println("Test 2");
        User user = userRepository.buscarUsuario("timo", "teo");
        String newName = "timoteo";
        assertEquals(true, userRepository.cambiarNombreUsuario(user, newName));
    }


    @After
    public void tearDown() {
        System.out.println("tearDown()");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass()");
    }


}