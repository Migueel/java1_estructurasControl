/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
//es la clase principal, abre la clase 
public class Ejemplo3While {
//este es el metodo principal donde se ejecuta todo  el codigo
    public static void main(String[] args) {
//aqui se declaran las variables
//final int significa que el valor de esta variable sera constante 
        final int VALOR_INICIAL = 10;  // limite inf. tabla
        final int VALOR_FINAL = 100;  // limite sup. tabla
        final int PASO = 10 ; // incremento
        int fahrenheit;
        double celsius;
        fahrenheit = VALOR_INICIAL;
        System.out.printf("Fahrenheit \t Celsius \n");
        while (fahrenheit <= VALOR_FINAL ){
               celsius = 5*(fahrenheit - 32)/9.0;
               System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
               fahrenheit += PASO;
        }
    }
}
