/*
 * Programa que obliga al usuario a introducir un número menor que 100
 */
import java.util.*;
public class Ejemplo1DoWhile {
    public static void main(String[] args) {
        int valor;
        Scanner in = new Scanner( System.in );
        //primero ejecutara las instrucciones del bloque do
        do {
            System.out.print("Escribe un entero < 100: ");
            valor = in.nextInt();
            //si la condicion se cumple se ejecutara el bloque while, si no se cumple volvera a preguntar
        }while (valor >= 100);
        System.out.println("Ha introducido: " + valor);
    }
}
