/*
 * programa que lee un número n y muestra n asteriscos
 */

import java.util.*;

public class Ejemplo2While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, contador = 0;

        System.out.print("Introduce un número: ");
     
        n = sc.nextInt();

	//mientras la variable contador sea menor al numero que hemos introducido
        while (contador < n){
//pinta en pantalla un "*"
               System.out.println(" * ");
//el valor de contador ira aumentando y pintando un "*" hasta igualar a n
               contador++;
        }
    }
}
