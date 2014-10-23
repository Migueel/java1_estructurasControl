 /*
 * programa que pide un número por teclado y calcula si es par o impar
 */
import java.util.*;//este metodo inporta las librerias
public class EjemploIf {//es la clase principal, abre la clase 
    public static void main(String[] args) {//este es el metodo principal donde se ejecuta todo  el codigo
       	


	//declaración de variables
        Scanner sc = new Scanner(System.in); //sirve para crear el objeto Scanner
        int num;    // aqui se declaran las variables, en este caso de tipo entero con int  
        System.out.println("Introduzca numero: ");// pinta en pantalla, una frase en este caso
        num = sc.nextInt(); //lee un entero por teclado y guarda la informacion para luego utilizarlo
        if ((num%2)==0)//es una condicion cualquier numero par divido entre dos no te da el sobrante entonces se ejecuta el codigo de abajo para decir que es un numero par 
           System.out.println("PAR");
        else // si la condicion cualquier numero inpar divido entre dos  te da el sobrante entonces se ejecuta el codigo de abajo para decir que es un numero impar
            System.out.println("IMPAR");
    }
}
