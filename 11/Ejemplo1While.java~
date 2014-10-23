/*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
//este metodo inporta las librerias
import java.util.*;
//es la clase principal, abre la clase 
public class Ejemplo1While {
//este es el metodo principal donde se ejecuta todo  el codigo
    public static void main(String[] args) {
// aqui se declaran las variables, en este caso de tipo entero con int  y se le da un valor = "0"
        int suma = 0, num;
//sirve para crear el objeto Scanner "sc"
        Scanner sc = new Scanner(System.in);
// pinta en pantalla, una frase en este caso
        System.out.print("Introduzca un número: ");
//lee un decimal por teclado y guarda la informacion para luego utilizarlo     
        num = sc.nextInt();
//es una condicion que sirve para entrar en un bucle bientras dicha condicion se cumpla por ejemplo num debe ser mayor a 0 para entrar en el bucle si num es menor a 0 sale del bucle y termina el codigo 
        while (num >= 0){
//estamos en el bucle
//realiza una suma con el numero(num) que has introducido y luego vuelve a pedir otro numero para realizar la suma otra vez y otra vez hasta que le de un numero negativo
               suma = suma + num; 
// pinta en pantalla, una frase en este caso
               System.out.print("Introduzca un número: ");
//lee un decimal por teclado y guarda la informacion para luego utilizarlo     
               num = sc.nextInt();
        }
// pinta en pantalla,el resultado de la suma
        System.out.println("La suma es: " + suma );
    }
}
