package com.accesoDatos.ejercicios.copyCaracteres;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Fichero.copiarFichero("/home/dam2a/texto1.txt", "/home/dam2a/texto2.txt");
    }
}
