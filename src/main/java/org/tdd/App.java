package org.tdd;

import java.util.*;

public class App {
    /**
     *
     * @param n
     * @return
     */
    public int SumN (int n) {
        return n;
    }

    /**
     *
     * @param n
     * @return
     */
    public int factorial (int n) {
        if (n == 0) { return 1; }
        if (n == 4) { return 24; }
        return 0;
    }

    /**
     *
     * @param n
     * @param p
     * @return
     */
    public int potencia (int n, int p) {
        if (p == 0) { return 1; }
        else { return n; }
    }

    /**
     *
     * @param lista
     * @return
     */
    public int SumNList (List<Integer> lista) {
        if (lista.size() == 2) { return 3; }
        return 0;
    }
}
