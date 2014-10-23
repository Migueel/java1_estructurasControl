/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
import java.util.*;
public class Ejemplo0Switch { 
    public static void main(String[] args) {
    

    	int mes;  
        
	Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero de mes: ");
        mes = sc.nextInt();
       
	//crea varias opciones
	switch (mes)//Se utiliza para seleccionar una de entre múltiples alternativas.
        {
		//si el numero introducido es 1 se ejecuta el codigo del case 1
		case 1: System.out.println("ENERO");
			//detiene la ejecucion del codigo                           
			break; 
                
		//si el numero introducido es 2 se ejecuta el codigo del case 2		
		case 2: System.out.println("FEBRERO");
			//detiene la ejecucion del codigo			
			break; 
                
		//(explicado)
		case 3: System.out.println("MARZO");
       			break;
                
		case 4: System.out.println("ABRIL");
 			break;
                
		case 5: System.out.println("MAYO");
 			break;
               
		case 6: System.out.println("JUNIO");
			break;
               
		case 7: System.out.println("JULIO");
			break;
                
		case 8: System.out.println("AGOSTO");
			break;

                case 9: System.out.println("SEPTIEMBRE");
			break;

                case 10: System.out.println("OCTUBRE");
			break;

                case 11: System.out.println("NOVIEMBRE");
			break;

                case 12: System.out.println("DICIEMBRE");
 			break;
		
		//se ejecuta cuando no se cumple ninguna de los casos anteriores 		
		default : System.out.println("Mes no válido");            
        }
    }
}
