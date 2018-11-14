import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LavadoraTest {

    @Test
    public void capacidadMaxima() {
        Lavadora lavadora = new Lavadora("samsung", "2019", "blanco", 20, "1 año",12);

        Assert.assertEquals("El peso esta dentro de la capacidad", lavadora.capacidadMaxima(20));
    }
}