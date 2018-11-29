package App;

public class Persona {
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private int edad;
    private int ci;

    public Persona(String nombre, String apellido_paterno, String apellido_materno, int edad, int ci){
        this.nombre = nombre;
        this.apellido_paterno = apellido_materno;
        this.apellido_materno = apellido_materno;
        this.edad = edad;
        this.ci = ci;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public String getApellido_paterno(){
        return apellido_paterno;
    }
    public void setApellido_paterno(){
        this.apellido_paterno = apellido_paterno;
    }
    public String getApellido_materno(){
        return apellido_materno;
    }
    public void setApellido_materno(){
        this.apellido_materno = apellido_materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

}
