/*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */

import java.util.*;
 
public class Ejemplo1While {

    public static void main(String[] args) {
	//declara la variable suma y le da el valor 0
        int suma = 0, num;

        Scanner sc = new Scanner(System.in);
 
        System.out.print("Introduzca un número: ");
    
        num = sc.nextInt();

	//crea un bucle, mientras se cumpla la condicion el codigo se seguira ejecutando 
        while (num >= 0){

               suma = suma + num; 

               System.out.print("Introduzca un número: ");
  
               num = sc.nextInt();
        }
// pinta en pantalla,el resultado de la suma
        System.out.println("La suma es: " + suma );
    }
}
