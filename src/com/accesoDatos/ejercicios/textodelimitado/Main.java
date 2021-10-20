package com.accesoDatos.ejercicios.textodelimitado;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

       // System.out.println("HOla\tBuenas");
           Fichero.grabarFichero("\\Users\\Usuario\\Documents\\DAM\\DAM2\\AD\\FICHEROS\\texto3.txt");
           Fichero.lerFichero();
    }
}
