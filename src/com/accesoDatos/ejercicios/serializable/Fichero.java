package com.accesoDatos.ejercicios.serializable;

import java.io.*;
import java.util.Objects;

public class Fichero {

    private static final String ruta = "\\Users\\Usuario\\Documents\\DAM\\DAM2\\AD\\FICHEROS\\serial.txt";

    static ObjectOutputStream salida;
    static FileOutputStream esrituraObjeto;
    static ObjectInputStream lecturaObjeto;
    static FileInputStream entrada;

    public static void almacenar(Object objeto) throws IOException {
        //Crea un fichero salvo que exista o sólo sea de lectura
        esrituraObjeto = new FileOutputStream(ruta);
        salida = new ObjectOutputStream(esrituraObjeto);

        salida.writeObject(objeto);
        salida.close();
        System.out.println("El objeto se ha añadido al fichero");

    }

    public static void cargarObjeto(Mclase valeiro) throws IOException, ClassNotFoundException {
        entrada = new FileInputStream(ruta);
        lecturaObjeto = new ObjectInputStream(entrada);
        Mclase objeto = (Mclase) lecturaObjeto.readObject();
        lecturaObjeto.close();
        System.out.println("Lectura completa");

        if (Objects.nonNull(objeto)){
         valeiro.setNome(objeto.getNome());
         valeiro.setNumero1(objeto.getNumero1());
         valeiro.setNumero2(objeto.getNumero2());
         System.out.println(valeiro);
        }else{
            System.out.println("Non se pode cargar o obxeto");
        }

    }
}
