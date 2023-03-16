package clase1;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String []arg) {
    
    Scanner input = new Scanner (System.in);

    System.out.println("Ingrese el primer numero: ");

    int numUno = input.nextInt();

    System.out.println("Ingrese el segundo numero: ");

    int numDos = input.nextInt();
    
    int suma = numUno+numDos;

    System.out.println("Su primer numero es: " + numUno + " y su segundo numero es: " + numDos);
    System.out.println("La suma de ambos numeros es " + suma);
        
    }
    
}