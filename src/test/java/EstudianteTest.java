import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EstudianteTest {
    @Test
    public void estudiante(){
        Estudiante estudiante = new Estudiante("Alex", "Roman", 9374327, 20);
        Materia materia1 = new Materia("Ingles", "123A", "55");
        Materia materia2 = new Materia("Lenguaje", "123B", "80");
        Materia materia3 = new Materia("Fisica", "123C", "90");
        List<Materia> m = new ArrayList<>();
        m.add(materia1);
        m.add(materia2);
        m.add(materia3);
        System.out.println(estudiante.getMateria("123A", m));
        Assert.assertEquals(("123A"+"\n"+"Ingles"+"\n"+55),estudiante.getMateria("123A",m));
    }
}