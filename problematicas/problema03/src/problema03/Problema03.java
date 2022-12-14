/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Usuario
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje = "";
        double celsius = 1;        
        for (int contador = 1; contador <=20; contador ++){
            mensaje = mensaje + contador + "\n";
            for (int fahrenheit = 20; fahrenheit < 100; fahrenheit += 4){
                celsius = 5/9 (fahrenheit - 32);
                String celsisus = null;
                mensaje = mensaje + "La convercion es:" + celsisus;
            }
        }
        System.out.println(mensaje);
    }
    
}
