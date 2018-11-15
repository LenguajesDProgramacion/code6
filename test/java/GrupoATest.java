import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrupoATest {

    @Test
    public void descuento() {
        GrupoA grupoa = new GrupoA("10", "Alex", 6);
        Assert.assertEquals("Pertenece al GrupoA", grupoa.Descuento(210.20));
    }
}