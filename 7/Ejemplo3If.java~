/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
import java.util.*; //este metodo inporta las librerias
public class Ejemplo3If {//es la clase principal, abre la clase 
    public static void main(String[] args) {//este es el metodo principal donde se ejecuta todo  el codigo


      //declaración de variables
      Scanner sc = new Scanner(System.in);//sirve para crear el objeto Scanner
      double nota;// aqui se declaran las variables, en este caso de tipo decimal con double  
      System.out.println("Introduzca una nota entre 0 y 10: ");// pinta en pantalla, una frase en este caso
      nota = sc.nextDouble();//lee un decimal por teclado y guarda la informacion para luego utilizarlo
     

      System.out.println("La calificación del alumno es ");// pinta en pantalla, una frase en este caso
      if(nota < 0 || nota > 10)// es  una condicion que dice que si la nota es menor a 0 o mayor a 10 se ejecuta el  System.out.println de abajo
         System.out.println("Nota no válida");
      else if(nota==10) // es  una condicion que dice que si la nota es igual a 10 se ejecuta el codigo abajo 
           System.out.println("Matrícula de Honor");
      else if (nota >= 9)// es  una condicion que dice que si la nota es mayor o igual a 9 se ejecuta el codigo de abajo
           System.out.println("Sobresaliente");
      else if (nota >= 7)// es  una condicion que dice que si la nota es mayor o igual a 7 se ejecuta el codigo de abajo
           System.out.println("Notable");
      else if (nota >= 6)// es  una condicion que dice que si la nota es mayor o igual a 6 se ejecuta el codigo de abajo
           System.out.println("Bien");
      else if (nota >= 5)// es  una condicion que dice que si la nota es mayor o igual a 5 se ejecuta el codigo de abajo
           System.out.println("Suficiente");
      else  // ya que la nota es inferior a 5 no se ejecuta ningun codigo de arriba y se ejecuta este de abajo 
           System.out.println("Suspenso");
    }
}
