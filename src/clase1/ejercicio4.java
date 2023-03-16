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
public class ejercicio4 {
    
    public static void main(String []arg) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese los grados centigrados que desea convertir");
        float gradosCent = input.nextInt();
        float gradosFareng = 32+(9*gradosCent/5);
        System.out.println(gradosFareng);
        
    }
    
    
}
