package estructuras_datos.pila_vector;

public class User {
    private int id;
    private String name, password;

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void mostrar(){
        System.out.println("\tUSER: ID: " + id + ", Nombre: " + name + ", Contraseña: " + password);    
    }
}