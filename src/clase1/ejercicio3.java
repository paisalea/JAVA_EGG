/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Leandro
 */
public class ejercicio3 {
 
    public static void main(String []arg){
        Scanner in = new Scanner (System.in);
        System.out.println("Ingrese la frase a convertir");
        String frase = in.nextLine();
//        String fraseMayusc = toUpperCase(frase);
//        String fraseMinusc = toLowerCase(frase);
        System.out.println(toUpperCase(frase));
        System.out.println(toLowerCase(frase));

        
    }
    
}
