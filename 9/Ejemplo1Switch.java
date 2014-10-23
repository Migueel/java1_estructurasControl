/*
 * Programa que pide dos números y un operador y muestra el resultado
 */
//importa las librerias de java.util y java.io
import java.util.*;
import java.io.*;

public class Ejemplo1Switch {

    public static void main(String[] args) throws IOException{
      
	int A,B, Resultado = 0 ;
//declara una variable de tipo char (un solo caracter)
        char operador;
//declara una variable de tipo boolean (true o false)
        boolean calculado = true;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero entero:");
      
	 A = sc.nextInt();

        System.out.print("Introduzca otro numero entero:");
  
        B = sc.nextInt();

        System.out.print("Introduzca un operador (+,-,*,/):");

        operador = (char)System.in.read();

        switch (operador) {

//ejecuta el codigo de uno de los case segun el valor que le hemos dado a la variable operador 
                case '-' : Resultado = A - B;
                           //detiene el codigo
			   break;
                case '+' : Resultado = A + B;
                           break;
                case '*' : Resultado = A * B;
                           break;
                case '/' : if(B!=0)//crea una condicion, si el valor de B es diferente a 0 se ejecutara el siguiente codigo  
                              Resultado = A / B;
                           else{//si el valor de B es igual a 0, no se ejecutara el codigo anterior y saltara al siguiente
                              System.out.println("\nNo se puede dividir por cero");
                              calculado = false;
                           }
                           break;

// si no se ejecuta ninguno de los casos anteriores se ejecutara el codigo de "default"      
                default : System.out.println("\nOperador no valido");
                          calculado = false;
                         
        }
//muestra el resultado en pantalla en el caso de "calculado = true"
        if(calculado){
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}
