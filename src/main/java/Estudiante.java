import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private String nombre;
    private String apellido;
    private int ci;
    private int edad;



    private List<Materia> materias;

   public Estudiante(String nombre, String apellido, int ci, int edad){
        super(nombre, apellido, ci, edad);
        this.materias = new ArrayList<>();
    }

   public void addMateria(Materia materia){
       this.materias.add(materia);
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
       int notaMinima = 100;
       for (Materia materia: this.materias){
           if (materia.getNota() <= notaMinima){
               notaMinima = materia.getNota();
           }
       }
       return notaMinima;
   }

}
