package com.accesoDatos.ejercicios.textodelimitado;

import java.io.*;


public class Fichero {

    static File fichero;
    static FileWriter escribir;
    static FileReader ler;
    static BufferedReader flujoLectura;
    static BufferedWriter flujoEscritura;
    static PrintWriter print;

    public static void grabarFichero(String ruta) throws IOException {

        String[] cod = {"p1", "p2", "p3"};
        String[] desc = {"parafusos", "cravos", "tachas"};
        int[] prezo = {3, 4, 5};

        fichero = new File(ruta);
        escribir = new FileWriter(fichero);
        flujoEscritura = new BufferedWriter(escribir);
        print = new PrintWriter(flujoEscritura);


            print.println(cod[0]+"\t"+cod[1]+"\t"+cod[2]);
            print.println(desc[0]+"\t"+desc[1]+"\t"+desc[2]);
            print.println(prezo[0]+"\t"+prezo[1]+"\t"+prezo[2]);

        print.close();
    }

        public static void lerFichero() throws IOException {

            ler = new FileReader(fichero);

            flujoLectura = new BufferedReader(ler);

            if (fichero.exists()) {

                String lecturaCodigo=flujoLectura.readLine();

                String lecturaDescricion=flujoLectura.readLine();

                String lecturaPrezo=flujoLectura.readLine();

                String [] codigo =lecturaCodigo.split("\t");

                String [] descricion = lecturaDescricion.split("\t");

                String [] prezo = lecturaPrezo.split("\t");

                System.out.println("Resultado lectura:\n");

                for(int i=0; i<3;i++) {
                    System.out.println("Código :        " + codigo[i] +
                            "\nDescricion :    " + descricion[i] +
                            "\nPrezo :         " + prezo[i]+"\n");
                }

                }


            }
        }



