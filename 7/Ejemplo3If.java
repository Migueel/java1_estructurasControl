/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
import java.util.*; 
public class Ejemplo3If {
    public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
      double nota;

      System.out.println("Introduzca una nota entre 0 y 10: ");

      nota = sc.nextDouble();
     

      System.out.println("La calificación del alumno es ");

      	//se crea una condicion, la variable nota tiene que ser menor a 0 o mayor a 10 para que se ejecute el siguiente codigo
      	if(nota < 0 || nota > 10)
         System.out.println("Nota no válida");
      
	//si no se cumple la condicion anterior, se crea otra. La nota tiene que ser igual a 10 para que se ejecute el siguiente codigo
	else if(nota==10)  
           System.out.println("Matrícula de Honor");
      
	//si no se cumple la condicion anterior, se crea otra. La nota tiene que ser igual o mayor a 9 para que se ejecute el siguiente codigo
	else if (nota >= 9)
           System.out.println("Sobresaliente");
     
	//si no se cumple la condicion anterior, se crea otra. La nota tiene que ser igual o mayor a 7 para que se ejecute el siguiente codigo
	 else if (nota >= 7)
           System.out.println("Notable");
      
	//si no se cumple la condicion anterior, se crea otra. La nota tiene que ser igual o mayor a 6 para que se ejecute el siguiente codigo
	else if (nota >= 6)
           System.out.println("Bien");
      
	//si no se cumple la condicion anterior, se crea otra. La nota tiene que ser igual o mayor a 5 para que se ejecute el siguiente codigo
	else if (nota >= 5)
           System.out.println("Suficiente");
      
	//si no se cumple ninguna de las condiciones anteriores se ejecuta el siguiente codigo
	else
           System.out.println("Suspenso");
    }
}
