import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String key;
    private String nombrecompleto;
    private String ci;
    private int edad;
    private boolean casado;
    private double salario;
    private List<Empleado> emp;

    public Empleado(String key, String nombrecompleto, String ci, int edad, boolean casado, double salario) {
        this.key = key;
        this.nombrecompleto = nombrecompleto;
        this.ci = ci;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
        this.emp = new ArrayList<>();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //metodos
    public String clasificacionEdad(String tipo){
        String detalle = "";
        int e = getEdad();
        boolean b;
        if (e <= 21) {
            detalle = ("principiante");
        }
        else if (e >= 22 && e <= 35){
                detalle = ("Intermedio");
        }
        else if (e >= 35){
            detalle = ("Senior");
        }
        return detalle;
    }



}
