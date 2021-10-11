/*
 * Author: Anas Nali
 * Date: 10/10/2021
 * Description: Ejercicio Feedback 1, Creacion archivo binario
 */
package com.company;
import java.io.*;    //Añadimos la libreria java.io que nos permite escribir y leer archivos


public class Main {
    public static void main(String[] args) throws
            IOException{
        File fichero = new      //Creamos el archivo binario poniendole de nombre departamentos.dat
                File("Departamentos.dat");
        FileOutputStream salida = new   //Utilizamos estas funciones que nos van a permitir escribir en el archivo
                FileOutputStream(fichero);
        DataOutputStream salidadatos = new
                DataOutputStream(salida);

        //Añadimos las variables que necesitamos que esten escritos en el archivo, en este caso departamento, nomnbre y localidad

        int departamento[] = {
                1, 2, 3, 4
        };

        String nombre[] = {

                "Recursos Humanos", "Contabilidad", "Informatica", "Marketing"

        };

        String localidad[] = {

                "Madrid", "Mijas", "Valencia", "Estepona"

        };

        //Creamos un bucle for que nos va a estar escribiendo los datos añadidos anteriormente en el archivo departamentos.dat

        for (int i = 0; i < departamento.length; i++) {
            salidadatos.writeUTF(nombre[i]);
            salidadatos.writeInt(departamento[i]);
            salidadatos.writeUTF(localidad[i]);

        }
        salidadatos.close();
    }
}