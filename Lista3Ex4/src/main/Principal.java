package main;

import java.util.Arrays;
import java.util.Collections;
import sp.fateczl.lucas.listaInt.*;
public class Principal {

    private Lista lista;

    public Principal() throws Exception {
        lista = new Lista();
        lista.addFirst(3);
        lista.addLast(5);
        lista.addLast(8);
        lista.addLast(12);
        lista.addLast(9);
        lista.addLast(7);
        lista.addLast(6);
        lista.addLast(2);
        lista.addLast(3);
        lista.addLast(7);
        lista.addLast(16);
    }

    public static void main(String[] args) throws Exception {
        Principal exemplo = new Principal();
        int max1 = exemplo.getMax1();
        int max2 = exemplo.getMax2();
        System.out.println("Os dois maiores valores da lista são: " + max1 + " e " + max2);
    }
    
    public int getMax1() {
        return Collections.max(Arrays.asList(lista.toArray(new Integer[0])));
    }

    public int getMax2() throws Exception {
        int max1 = getMax1();
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < lista.size(); i++) {
            int elemento = lista.get(i);
            if (elemento < max1 && elemento > max2) {
                max2 = elemento;
            }
        }

        return max2;
    }

}
