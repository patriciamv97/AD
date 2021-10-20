package com.accesoDatos.ejercicios.copyCaracteres;

import java.io.*;

public class Fichero {
    static FileWriter escribir;
    static FileReader ler;
    public static void copiarFichero(String copiado,String copia) throws IOException {

        ler = new FileReader(copiado);
        escribir= new FileWriter(copia);
        int lectura;
            while ((lectura = ler.read()) != -1) {
                escribir.write(lectura);
            }
        System.out.println((char) lectura);

        ler.close();
        escribir.close();

    }
}
