public class PersonaU {
    private String nombre;
    private String apellido;
    private int ci;
    private int edad;

    public PersonaU(String nombre, String apellido, int ci, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getCi() {
        return ci;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
