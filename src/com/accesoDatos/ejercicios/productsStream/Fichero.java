package com.accesoDatos.ejercicios.productsStream;

import java.io.*;
import java.util.Objects;

public class Fichero {
    static FileInputStream flujoEntrada;

    static FileOutputStream flujoSalida;

    static DataInputStream lectura;

    static DataOutputStream escritura;

    static BufferedInputStream buferEntrada;

    static BufferedOutputStream buferSalida;

    public static void escribirFichero(Product product,String nombre, boolean append) throws IOException {

        flujoSalida= new FileOutputStream(nombre,append);

        buferSalida =new BufferedOutputStream(flujoSalida);

        escritura = new DataOutputStream (buferSalida);

        escritura.writeUTF(product.getCodigo()+", "+product.getDescricion()+", ");

        escritura.writeDouble(product.getPrezo());

        escritura.close();
    }

    public static  void lerFichero(String nombre) throws IOException {


        flujoEntrada =new FileInputStream(nombre);

        buferEntrada =new BufferedInputStream(flujoEntrada) ;

        lectura = new DataInputStream (buferEntrada);


        while(lectura.available()!=0) {
            System.out.println(lectura.readUTF() + + lectura.readDouble());
        }
        lectura.close();



    }

    public static void cargarNulo(Product product1, Product product2){

        if (Objects.nonNull(product1)) {

            product2.setCodigo(product1.getCodigo());
            product2.setDescricion(product1.getDescricion());
            product2.setPrezo(product1.getPrezo());

        }else{
            System.out.println("No se puede cargar el objeto");
        }
    }
}
