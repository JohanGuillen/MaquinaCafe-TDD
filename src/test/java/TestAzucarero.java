
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestAzucarero {

    Azucarero azucarero;

    @Before
    public void setUp() {
        azucarero = new Azucarero(18);
    }

    @Test
    public void deberiaDevolverVerdaderoSiHaySuficienteAzucarEnElAzucarero() {
        boolean resultado = azucarero.hasAzucar(5);

        assertEquals(true, resultado);

        resultado = azucarero.hasAzucar(18);

        assertEquals(true, resultado);
    }

    @Test
    public void deberiaDevolverFalsoPorqueNoHaySuficienteAzucarEnElAzucarero() {
        boolean resultado = azucarero.hasAzucar(19);

        assertEquals(false, resultado);
    }

    @Test
    public void deberiaRestarAzucarAlAzucarero() {
        azucarero = new Azucarero(10);

        azucarero.giveAzucar(5);
        assertEquals(5, azucarero.getCantidadAzucar());

        azucarero.giveAzucar(2);
        assertEquals(3, azucarero.getCantidadAzucar());

        System.out.println("TEST 3 PASSED");
    }
}
