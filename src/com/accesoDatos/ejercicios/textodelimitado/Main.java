package com.accesoDatos.ejercicios.textodelimitado;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

            Fichero.grabarFichero("/home/dam2a/array.txt");
            Fichero.lerFichero("/home/dam2a/array.txt");
    }
}
