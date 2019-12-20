/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg29;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Teclado = new Scanner(System.in);
       String frase, texto="";
       char letra;

        do {
            System.out.println("Digite una frase: ");
            frase = Teclado.nextLine();
            texto=texto+" "+frase;
            letra = frase.charAt(0);
         
        } while (letra != ' ');
        
        System.out.println("El texto conformado es: ");
        System.out.println(texto);   
    } 
}
