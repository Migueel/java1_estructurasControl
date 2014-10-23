 /*
 * Programa que pide una nota por teclado y muestra si se ha aprobado o no
 */
import java.util.*;
public class Ejemplo0If {
    public static void main( String[] args ){
        

	Scanner sc = new Scanner( System.in ); 
        System.out.print("Nota: ");
        int nota = sc.nextInt(); 
        
	//crea una condicion la cual debe ser cumplida para que el codigo se ejecute 
	if (nota >= 5 ){ 
            System.out.println("¡Enhorabuena!");
            System.out.println("Has aprobado");
        }
	//solo se ejecuta si la condicion if no se cumple
        else 
            System.out.println("Lo Siento, has suspendido");
    }
}
