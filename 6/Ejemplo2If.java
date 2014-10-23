 /*
 * Programa que muestra un saludo distinto según la hora introducida
 */
import java.util.*;
public class Ejemplo2If {
    public static void main(String[] args) {
       	

      Scanner sc = new Scanner(System.in); 
      int hora; 
      System.out.println("Introduzca una hora (un valor entero): ");
      hora = sc.nextInt();
     
	//crea una condicion, la variable hora tiene que ser mayor o igual a 0 y menor a 12 para que se ejecute
	 if (hora >= 0 && hora < 12) 
	
          System.out.println("Buenos días");
	
	//si no se cumple la condicion anterior crea otra,  la variable hora tiene que ser mayor o igual a 12 y menor a 21 para que se ejecute
     	else if (hora >= 12 && hora < 21) 

           System.out.println("Buenas tardes");
	
	//si no se cumple la condicion anterior crea otra,  la variable hora tiene que ser mayor o igual a 21 y menor a 24 para que se ejecute
     	 else if (hora >= 21 && hora < 24)
            
	System.out.println("Buenas noches");

	//se ejecutara el siguiente codigo si no se cumple ninguna de las condiciones anteriores
      else 
            System.out.println("Hora no válida");
    }
}
