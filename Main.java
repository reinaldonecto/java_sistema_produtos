package com.portfolio.produtos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Notebook", 3500));
        lista.add(new Produto("Mouse", 90));
        lista.add(new Produto("Teclado", 150));
        lista.add(new Produto("Headset", 250));

        for (Produto p : lista) {
            p.exibir();
        }
    }
}

