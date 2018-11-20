import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrupoC1Test {

    @Test
    public void totalPagar() {
        //esto es polimorfismo
        Cliente1 cliente1 = new GrupoA1("Daniel", 123, 10500 );
        Cliente1 cliente2 = new GrupoB1("Sofia", 145, 2);
        Cliente1 cliente3 = new GrupoC1("Andrea", 254, 20000);

        System.out.println(cliente1.totalPagar());
        System.out.println(cliente2.totalPagar());
        System.out.println(cliente3.totalPagar());
    }
}