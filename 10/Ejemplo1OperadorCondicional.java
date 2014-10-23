 /*
  * programa que pide un número por teclado y calcula si es par o impar
  */

import java.util.*;

public class Ejemplo1OperadorCondicional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
  
        int num;      

        System.out.println("Introduzca numero: ");
    
        num = sc.nextInt();
//muestra en pantalla el si el numero es par o impar
        System.out.println((num%2)==0 ? "PAR" : "IMPAR"); //divide el numero introducido entre 2 y si el residuo es 0, si es asi el numero es par
    }
}
