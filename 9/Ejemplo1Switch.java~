/*
 * Programa que pide dos números y un operador y muestra el resultado
 */
//este metodo inporta las librerias
import java.util.*;
import java.io.*;
//es la clase principal, abre la clase 
public class Ejemplo1Switch {
//este es el metodo principal donde se ejecuta todo  el codigo
    public static void main(String[] args) throws IOException{
// aqui se declaran las variables, en este caso de tipo entero con int       
	int A,B, Resultado = 0 ;
//significa que se declara una variable de tipo caracter con "char"
        char operador;
//boolean se utiliza para contener valores de dos estados como true/false, sí/no o activado/desactivado. pide un operador
        boolean calculado = true;
//sirve para crear el objeto Scanner "sc"
        Scanner sc = new Scanner(System.in);
// pinta en pantalla, una frase en este caso
        System.out.print("Introduzca un numero entero:");
//lee un decimal por teclado y guarda la informacion para luego utilizarlo       
	 A = sc.nextInt();
// pinta en pantalla, una frase en este caso
        System.out.print("Introduzca otro numero entero:");
//lee un decimal por teclado y guarda la informacion para luego utilizarlo   
        B = sc.nextInt();
// pinta en pantalla, una frase en este caso
        System.out.print("Introduzca un operador (+,-,*,/):");
//lee un caracter por teclado utiliando la bariable char para luego utilzarlo
        operador = (char)System.in.read();
//Se utiliza para seleccionar una de entre múltiples alternativa, en cuanto elijes un operador se ejecuta el codigo de switch
        switch (operador) {
//cuando el caracter introducido es igual a - entonces salta al case y  se ejecutan las instrucciones que siguen al case seleccionado hasta que se encuentra un break
                case '-' : Resultado = A - B;
                           break; // quiere decir que se rompe el ciclo o termina el switch
                case '+' : Resultado = A + B;
                           break;
                case '*' : Resultado = A * B;
                           break;
                case '/' : if(B!=0) 
                              Resultado = A / B;
                           else{//cuando se introcude un valor B="0" se ejecuta el else por que no se puede dividir entre 0 
                              System.out.println("\nNo se puede dividir por cero");
                              calculado = false;
                           }
                           break; // quiere decir que se rompe el ciclo o termina el switch

// cuando ninguno de los casos "case" se cumple se ejecuta  el bloque default y se ejecutan las instrucciones que siguen al default       
                default : System.out.println("\nOperador no valido");
                          calculado = false;
                         
        }
//pinta el resultado de la operaciones seleccionada en el switch
        if(calculado){
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}
