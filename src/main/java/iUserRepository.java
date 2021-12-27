public interface iUserRepository {
    public boolean eliminarPerfil(User user);

    public boolean cambiarNombreDeUsuario(User user, String nuevoNombre);
}
