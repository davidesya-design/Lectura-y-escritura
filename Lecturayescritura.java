package com.mycompany.lecturayescritura;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tralk
 */
public class Lecturayescritura {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // -Escrituraw del archivo
        try {
            FileWriter archivo = new FileWriter("mis_notas.txt");
            PrintWriter escritor = new PrintWriter(archivo);
            
            //Notas fijas
            escritor.println("hoy pude ver como funcionan archivos en Java.");
            escritor.println("Es importante no olvidar de poner las llaves ya me a pasado varias veces .");
            escritor.println("Practicar con ejemplos me ayuda a comprender mejor.");
            
            // aqui puedo poner una oracion personalizada
            System.out.print("Ingresa una nota: ");
            String personalizada = entrada.nextLine();
            escritor.println(personalizada);
            
            escritor.close();
            System.out.println("Archivo 'mis_notas.txt' creado y escrito correctamente.");
            
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
        
        // Aqui se lee el archivo
        try {
            BufferedReader lector = new BufferedReader(new FileReader("mis_notas.txt"));
            
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println("Nota: " + linea);
            }
            
            lector.close();
            
        } catch (IOException e) {
            System.out.println("Huvo un error al leer el archivo: " + e.getMessage());
        }
    }
}
