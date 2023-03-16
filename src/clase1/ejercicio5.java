/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class ejercicio5 {
    
    public static void main(String []arg){
        
        Scanner in = new Scanner (System.in);
        System.out.println("Ingrese el numero a trabajar");
        int numero = in.nextInt();
        int doble = numero*2;
        int triple = numero*3;
        double raiz = Math.sqrt(numero);
        
        System.out.println("El doble del numero es: "+ doble);
        System.out.println("El triple del numero es: " + triple);
        System.out.println("La raiz cuadrada del numero es: " + raiz);
    }
}
