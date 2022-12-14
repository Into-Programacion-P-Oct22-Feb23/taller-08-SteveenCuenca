/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        int edad;
        String listadoEdades = "";
        double estatura;
        String mensaje = "";
        for (int jugadores = 1; jugadores <= 5; jugadores++) {            
            System.out.println("Ingrese el nombre del jugador" + jugadores);
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición" + jugadores);
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador" + jugadores);
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador" + jugadores);
            estatura = entrada.nextDouble();
            listadoEdades = listadoEdades + edad + " ";
            mensaje = mensaje + nombre + "-" + posicion + "-" + ", edad" + edad
                    + ", estatura" + estatura + "\n";
            entrada.nextLine();
        }
        
        System.out.printf("""
                          Listado de jugadores:
                          %slistado de Edades:%s """,
                mensaje, listadoEdades);
    }

}
