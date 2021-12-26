import org.junit.*;
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
        User user = new User("david","arteaga");
        userRepository.guardarUsuario(user);

    }

    @Test
    public void given_an_user_when_delete_then_return_true() {
        System.out.println("Test 1");
        User user = userRepository.buscarUsuario("david","arteaga");
        assertEquals(true, userRepository.eliminarPerfil(user));
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