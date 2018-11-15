public abstract class SeleccionFutbol {
    private int key;
    private String nombre;
    private String apellidos;
    private int edad;

    public SeleccionFutbol(int key, String nombre, String apellidos, int edad){
        this.key = key;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this. edad = edad;
    }

    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public abstract void Entrenamiento();

    public abstract void PartidoFutbol();
}
