public class EjecucionHistoriasDeUsuario {

    public static void main(String[] args) {
        System.out.println("=== Ejecución de historias de usuario ===");
        System.out.println("Primera historia de usuario: Elimnar un perfil");
        UserRepository userRepository = new UserRepository();
        User user1 = new User("Juan", "juan123");
        User user2 = new User("Pedro", "pedroARte");
        User user3 = new User("Maria", "cats543");
        userRepository.guardarUsuario(user1);
        userRepository.guardarUsuario(user2);
        userRepository.guardarUsuario(user3);
        System.out.println("Se crean los usuarios:");
        for (User user : new User[]{user1, user2, user3}) {
            System.out.println("\t" + user.getUsername() + " " + user.getPassword());
        }
        System.out.println("Se los eliminan: ");
        for(User user : new User[]{user1, user2, user3}) {
            userRepository.eliminarPerfil(user);
        }


        System.out.println("\n\nSegunda historia de usuario: Cambiar nombre de usuario");
        User user4 = new User("Juan", "juan123");
        User user5 = new User("Pedro", "pedroARte");

        userRepository.guardarUsuario(user4);
        userRepository.guardarUsuario(user5);

        System.out.println("Se crean los usuarios:");
        for (User user : new User[]{user4, user5}) {
            System.out.println("\t" + user.getUsername() + " " + user.getPassword());
        }

        System.out.println("\nSe cambian los nombres de los usuarios:");
        for (User user : new User[]{user4, user5}) {
            userRepository.cambiarNombreUsuario(user, "Juanito");
        }
        // Se muestran los usuarios
        System.out.println("\nSe muestran los nuevos nombres usuarios:");
        for (User user : new User[]{user4, user5}) {
            System.out.println("\t" + user.getUsername() + " " + user.getPassword());
        }
    }
}
