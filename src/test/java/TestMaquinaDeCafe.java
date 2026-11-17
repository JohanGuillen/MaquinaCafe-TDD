import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMaquinaDeCafe {

    Cafetera cafetera;
    Vaso vasosPequeño;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Azucarero azucarero;
    MaquinaDeCafe maquinaDeCafe;

    @Before
    public void setUp() {
        cafetera = new Cafetera(50);
        vasosPequeño = new Vaso(5, 10);
        vasosMediano = new Vaso(5, 20);
        vasosGrande = new Vaso(5, 30);
        azucarero = new Azucarero(20);

        maquinaDeCafe = new MaquinaDeCafe();
        maquinaDeCafe.setCafetera(cafetera);
        maquinaDeCafe.setVasosPequeño(vasosPequeño);
        maquinaDeCafe.setVasosMediano(vasosMediano);
        maquinaDeCafe.setVasosGrande(vasosGrande);
        maquinaDeCafe.setAzucarero(azucarero);
    }

    @Test
    public void deberiaDevolverUnVasoPequeño() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");

        assertEquals(maquinaDeCafe.vasosPequeño, vaso);

        System.out.println("TEST 1 PASSED");
    }
    @Test
    public void deberiaDevolverUnVasoMediano() {
        MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe();

        Vaso vaso = maquinaDeCafe.getTipoVaso("mediano");

        assertEquals(maquinaDeCafe.vasosMediano, vaso);

        System.out.println("TEST 2 PASSED");
    }
    @Test
    public void deberiaDevolverUnVasoGrande() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("grande");

        assertEquals(maquinaDeCafe.vasosGrande, vaso);

        System.out.println("TEST 3 PASSED");
    }
    @Test
    public void deberiaDevolverNoHayVasos() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 10, 2);

        assertEquals("No hay Vasos", resultado);

        System.out.println("TEST 4 PASSED");
    }
    @Test
    public void deberiaDevolverNoHayCafe() {
        cafetera = new Cafetera(5);
        maquinaDeCafe.setCafetera(cafetera);

        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 2);

        assertEquals("No hay Cafe", resultado);

        System.out.println("TEST 5 PASSED");
    }
    @Test
    public void deberiaDevolverNoHayAzucar() {
        azucarero = new Azucarero(2);
        maquinaDeCafe.setAzucarero(azucarero);

        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);

        assertEquals("No hay Azucar", resultado);

        System.out.println("TEST 6 PASSED");
    }
    @Test
    public void deberiaRestarCafe() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");

        maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);

        int resultado = maquinaDeCafe.getCafetera().getCantidadCafe();

        assertEquals(40, resultado);

        System.out.println("TEST 7 PASSED");
    }
    @Test
    public void deberiaRestarVaso() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");

        maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);

        int resultado = maquinaDeCafe.getVasosPequeño().getCantidadVasos();

        assertEquals(4, resultado);

        System.out.println("TEST 8 PASSED");
    }
    @Test
    public void deberiaRestarAzucar() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");

        maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);

        int resultado = maquinaDeCafe.getAzucarero().getCantidadAzucar();

        assertEquals(17, resultado);

        System.out.println("TEST 9 PASSED");
    }
    @Test
    public void deberiaDevolverFelicitaciones() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeño");

        String resultado = maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);

        assertEquals("Felicitaciones", resultado);

        System.out.println("TEST 10 PASSED");
    }
}