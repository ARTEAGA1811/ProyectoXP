import sun.font.TrueTypeFont;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> usuarios;

    public UserRepository(List<User> usuarios){this.usuarios=usuarios;}

    public UserRepository(){
        //Creamos 2 usuarios por defecto en esta primera version
        //Cuando se implemente la funcionalidad de registro de usuarios se debe crear un metodo
        //registrarUsuario() que añada usuarios a la lista.
        usuarios = new ArrayList<>();
        User user1 = new User();
        user1.setUsername("andrea");
        user1.setPassword("password1");
        User user2 = new User();
        user2.setUsername("gabriel");
        user2.setPassword("password2");
        usuarios.add(user1);
        usuarios.add(user2);
    }

    public User buscarUsuario(User user){
        for (User user1: usuarios){
            if(user.equals(user1)){
                return user1;
            }
        }
        return null;
    }

    public User buscarUsuario(String nombreUsuario, String clave){
        for (User user1: usuarios){
            if(user1.getUsername().equals(nombreUsuario) && user1.getPassword().equals(clave)){
                return user1;
            }
        }
        return null;
    }

    public User guardarUsuario(User user){

        if(user != null){
            if (user.getUsername()==null || user.getPassword()==null)
                return null;
            User user1 = buscarUsuario(user);
            if (user1!=null)
                return user1;
            usuarios.add(user);
            return  user;
        }
        return null;
    }



}
