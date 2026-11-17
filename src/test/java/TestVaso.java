
import static org.junit.Assert.*;
import org.junit.Test;

public class TestVaso {

    @Test
    public void deberiaDevolverVerdaderoSiExistenVasos() {
        Vaso vasosPequeños = new Vaso(2, 18);

        boolean resultado = vasosPequeños.hasVasos(1);

        assertEquals(true, resultado);
    }

    @Test
    public void deberiaDevolverFalsoSiNoExistenVasos() {
        Vaso vasosPequeños = new Vaso(1, 18);

        boolean resultado = vasosPequeños.hasVasos(2);

        assertEquals(false, resultado);
    }

    @Test
    public void deberiaRestarCantidadDeVaso() {
        Vaso vasosPequeños = new Vaso(5, 10);

        vasosPequeños.giveVasos(1);

        assertEquals(4, vasosPequeños.getCantidadVasos());
    }
}
