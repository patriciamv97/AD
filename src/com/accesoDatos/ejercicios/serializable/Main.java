package com.accesoDatos.ejercicios.serializable;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Mclase mclase = new Mclase("ola",-7,2.7E10);
        Mclase valeiro = new Mclase();
        Fichero.almacenar(mclase);
        Fichero.cargarObjeto(valeiro);
    }
}
