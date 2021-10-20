package com.accesoDatos.ejercicios.copyCaracteres2;

import java.io.*;

public class Fichero {
    static FileWriter escribir;
    static FileReader ler;
    static BufferedReader flujoLectura;
    static BufferedWriter flujoEscritura;
    public static void copiarFichero(String copiado,String copia) throws IOException {

        ler = new FileReader(copiado);
        flujoLectura = new BufferedReader(ler);
        escribir= new FileWriter(copia);
        flujoEscritura= new BufferedWriter(escribir);
        String lectura;
            while ((lectura = flujoLectura.readLine()) != null) {
                flujoEscritura.write(lectura);

            }

        ler.close();
        escribir.close();

    }
}
