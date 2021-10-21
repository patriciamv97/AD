package com.accesoDatos.ejercicios.serializacion2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] cod={"p1","p2","p3"};
        String[] desc ={"parafusos","cravos ","tachas"};
        int[] prezo ={3,4,5};

        Product p1 = new Product(cod[0],desc[0],prezo[0]);
        Product p2 = new Product(cod[1],desc[1],prezo[1]);
        Product p3 = new Product(cod[2],desc[2],prezo[2]);

        Ficheiro.grabarFicheiro(p1,p2,p3);
        Ficheiro.lerFicheiro();

    }
}
