/*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */
import java.util.*;
public class Ejemplo2DoWhile {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner( System.in );
        
        do {
            System.out.print("Escribe un número entre 1 y 10: ");
            n = sc.nextInt();
            //se ejecutara el siguiente bloque mientras el valor de n este entre 1 y 10
        }while (n<1 || n >10);
        System.out.println("Ha introducido: " + n);
    }
}
