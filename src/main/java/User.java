public class User{

    //Nota David: Necesito alguna manera de relacionar el calendario con el usuario
    //por lo tanto, una manera que me pueda relacionar es con el id del usuario.
    //Se agrega el idGlobal ya que necesito una forma de ir creando automaticamente nuevos id.
    //Se agrega un contructor par que se agregue el id para cada usuario.
    private int id;
    public static int idGlobal = 0;

    private String username;
    private String password;

    public User(){
        idGlobal++;
        this.id = idGlobal;
    }

    public User(String usuario, String clave){
        this.username = usuario;
        this.password =  clave;
        idGlobal++;
        this.id = idGlobal;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }



    //Aquí agregué los métodos get y set para el id.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        User toCompare = (User) obj;
        return this.username.equalsIgnoreCase(toCompare.getUsername())
                && this.password.equalsIgnoreCase(toCompare.getPassword());
    }


}



