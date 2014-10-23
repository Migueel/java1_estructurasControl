 /* Programa que lea dos números por teclado y los muestre por pantalla.
 */
//importa las librerias de java.util
import java.util.*;
//declara la clase
public class Main {
    //linea de arranque, ejecuta la clase
    public static void main(String[] args){ 

        //declara las variables
        int n1, n2;
	//crea un objeto Scanner 
        Scanner sc = new Scanner(System.in); 
	//muestra en pantalla una frase
        System.out.println("Introduce un número entero: "); 
	//le da el valor introducido por teclado a la variable "n1"
        n1 = sc.nextInt(); 

       
        System.out.println("Introduce otro número entero: ");
        n2 = sc.nextInt();     

        //muestra en pantalla una frase + los valores de las variables "n1" y "n2"
        System.out.println("Ha introducido los números: " + n1 + " y " + n2); 
    }
}
