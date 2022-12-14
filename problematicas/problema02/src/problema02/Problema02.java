/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author Usuario
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero2;
        int numero3;
        int numero4;
        String mensaje = "";
        mensaje = mensaje + "N°\tx2\tx3\tx4\n";
        for(int contador = 25; contador >=1; contador--){
            numero2 = contador * 2;
            numero3 = contador * 3;
            numero4 = contador * 4;
            mensaje = String.format("%s%d\t%d\t%d\t%d\n", 
                    mensaje, contador, numero2, numero3, numero4);
           
        }
        System.out.println(mensaje);
    }
    
}
