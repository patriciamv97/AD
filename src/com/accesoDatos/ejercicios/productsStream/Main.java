package com.accesoDatos.ejercicios.productsStream;

import java.io.*;

import static com.accesoDatos.ejercicios.productsStream.Fichero.*;


public class Main {


    public static void main(String[] args) {
        Product p1 = new Product("cod1","parafusos", (double) 3);
        Product p2 = new Product("cod2","cravos", (double) 4);
        Product p3 = new Product();
        try {
             /*  escribirFichero(p1,"\\Users\\Usuario\\Desktop\\produtos.txt",false);
            escribirFichero(p2,"\\Users\\Usuario\\Desktop\\produtos.txt",true);
            */
            cargarNulo(p1,p3);
            escribirFichero(p3,"/home/dam2a/produtos.txt",false);
            cargarNulo(p2,p3);
            escribirFichero(p3,"/home/dam2a/produtos.txt",true);
            System.out.println("lista de productos gardados no ficheiro produtos.txt");
            lerFichero("/home/dam2a/produtos.txt");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }



}
