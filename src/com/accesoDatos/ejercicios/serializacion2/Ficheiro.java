package com.accesoDatos.ejercicios.serializacion2;

import java.io.*;
import java.util.Objects;

public class Ficheiro {

    private static final String ruta ="/home/dam2a/serial2.txt";
    static FileOutputStream salida;
    static FileInputStream entrada;
    static ObjectOutputStream flujoEscritura;
    static ObjectInputStream flujoLectura;

    public static void grabarFicheiro(Object obj, Object obj2,Object obj3) throws IOException {

        salida = new FileOutputStream(ruta);
        flujoEscritura = new ObjectOutputStream(salida);
        flujoEscritura.writeObject(obj);
        flujoEscritura.writeObject(obj2);
        flujoEscritura.writeObject(obj3);
        flujoEscritura.writeObject(null);
        salida.close();

    }

    public static void lerFicheiro() throws IOException, ClassNotFoundException {
        entrada = new FileInputStream(ruta);
        flujoLectura = new ObjectInputStream(entrada);
        Object lectura;
        while(Objects.nonNull(lectura=flujoLectura.readObject())){
            System.out.println(lectura);
        }


        flujoLectura.close();
    }
}
