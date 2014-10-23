 /*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */
import java.util.*; 
public class Main { 
    public static void main(String[] args){
       	
	Scanner sc = new Scanner(System.in); 
	//se declaran las variables del tipo "double"        
	double numero1, numero2; 

        System.out.println("Introduce el primer número:"); 
        
	//le da el valor introducido de tipo double por teclado a la variable "numero1"
	numero1 = sc.nextDouble(); 

        System.out.println("Introduce el segundo número:");  

        numero2 = sc.nextDouble(); 

	
        System.out.println("Números introducido: " + numero1 + "  " + numero2);
      
	//suma las dos variables  y lo muestra en pantalla
  	System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
	//resta las dos variables  y lo muestra en pantalla
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2));
	//multiplica las dos variables  y lo muestra en pantalla 
        System.out.println(numero1 + " * " + numero2 + " = " + numero1*numero2);   
    }
}
