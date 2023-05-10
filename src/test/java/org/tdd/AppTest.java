package org.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App myApp;
    @Before
    public void setup(){
        myApp = new App();
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void SumNUno() {
        int resultado = myApp.SumN(1);
        assertTrue( resultado == 1 );
    }

    @Test
    public void SumNmayorQueUno() {
        int resultado = myApp.SumN(4);
        assertTrue( resultado == 4 );
    }

    @Test
    public void SumNmayorCero() {
        int resultado = myApp.SumN(0);
        assertTrue( resultado == 0 );
    }

    @Test
    public void factorialCero() {
        int resultado = myApp.factorial(0);
        assertTrue( resultado == 1 );
    }

    @Test
    public void factorialMayorCero() {
        int resultado = myApp.factorial(4);
        assertTrue( resultado == 24 );
    }

    @Test
    public void potenciaExponenteCero() {
        int resultado = myApp.potencia(2, 0);
        assertTrue( resultado == 1 );
    }

    @Test
    public void potenciaExponenteUno() {
        int resultado = myApp.potencia(2, 1);
        assertTrue( resultado == 2 );
    }

    @Test
    public void SumNListVacio() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int resultado = myApp.SumNList(lista);
        assertTrue( resultado == 0 );
    }

    @Test
    public void SumNListNoVacio() {
        List<Integer> lista = Arrays.asList(1,2);
        int resultado = myApp.SumNList(lista);
        assertTrue( resultado == 3 );
    }
}
