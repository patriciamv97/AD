package com.accesoDatos.ejercicios.primitiveWriteUTF;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class Fichero {

        FileInputStream flujoEntrada;

        FileOutputStream flujoSalida;

        DataInputStream lectura;

        DataOutputStream escritura;

        BufferedInputStream buferEntrada;

        BufferedOutputStream buferSalida;

        public void escribirFichero(String nombre) throws FileNotFoundException{

            // Abrimos un flujo de entrada que extrae los datos del archivo

            flujoEntrada =new FileInputStream(nombre);

            // Guardamos los datos del archivo en un bufer y mantenemos el flujo abierto

            buferEntrada =new BufferedInputStream(flujoEntrada) ;

            // Leemos los datos del bufer

            lectura = new DataInputStream (buferEntrada);

            //  Creamos un fichero salvo que exista salvo o que sólo sea de lectura

            flujoSalida= new FileOutputStream(nombre);

            // Escribimos  datos en el bufer en vez de en el archivo

            buferSalida =new BufferedOutputStream(flujoSalida);

            escritura = new DataOutputStream (buferSalida);

        }
    }
