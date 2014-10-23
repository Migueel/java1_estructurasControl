/*
 * programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */
public class Ejemplo3For {
    public static void main(String[] args) {
        int a, b;
        //este bloque se ejecutara hasta que la suma de a y b sea mayor a 10 
        for(a = 1, b = 1; a + b < 10; a++, b+=2){ //el valor de a se ira incrementando en 1 y el de b en 2
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
        }
    }
}
