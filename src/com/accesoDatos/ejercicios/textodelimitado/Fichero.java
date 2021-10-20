package com.accesoDatos.ejercicios.textodelimitado;

import java.io.*;

public class Fichero {

    static File fichero;
    static FileWriter escribir;
    static FileReader ler;
    static BufferedReader flujoLectura;
    static BufferedWriter flujoEscritura;
    static PrintWriter print;

    public static void grabarFichero(String ruta) throws IOException {

        String[] cod = {"p1", "p2", "p3"};
        String[] desc = {"parafusos", "cravos", "tachas"};
        int[] prezo = {3, 4, 5};

        fichero = new File(ruta);
        escribir = new FileWriter(fichero);
        flujoEscritura = new BufferedWriter(escribir);
        print = new PrintWriter(flujoEscritura);

        for (int i = 0; i < 3; i++) {
            print.println(cod[i] + "\t");
            print.println(desc[i] + "\t");
            print.println(prezo[i] + "\t");

        }

        print.close();
    }

    public static void lerFichero(String ruta) throws IOException {
        ler = new FileReader(fichero);
        flujoLectura = new BufferedReader(ler);

        if (fichero.exists()) {
            //String lectura= flujoLectura.readLine();

            do {

                String[] array = new String[9];
                for (int i = 0; i < 9; i++) {
                   // array[0]=lectura;
                    array[i] = flujoLectura.readLine();
                    System.out.println(array[i]);
                }
            }
            while (flujoLectura.readLine() != null);

        }
    }
}


