import java.util.ArrayList;
import java.util.List;

public class EstudianteU extends PersonaU {

    private List<Materia> materias;

    public EstudianteU(String nombre, String apellido, int ci, int edad){
        super(nombre, apellido, ci, edad);
        this.materias = new ArrayList<>();
    }

    public void addMateria(Materia materia){
        this.materias.add(materia);
    }
    public void quitarMateria(Materia materia){
        this.materias.remove(materia);
    }
    public  String getMateria(String key, List<Materia> materias){
        String detalle = "";
        for (Materia materia: materias) {
            if (materia.getKey().equals(key)){
                detalle = materia.getKey()+"\n"+materia.getNombre()+"\n"+materia.getNota();
                break;
            }
        }
        return detalle;
    }
    public int getNotaMin(){
        String detalle = "";
        int notaMinima = 51;
        for (Materia materia: this.materias){
            if (materia.getNota() <= notaMinima){
               // notaMinima = materia.getNota();
                detalle = "Materia reprobada";
            }
            else if (materia.getNota() >= notaMinima){
                detalle = "Materia aprobada";
            }
        }
        return notaMinima;
    }

}
