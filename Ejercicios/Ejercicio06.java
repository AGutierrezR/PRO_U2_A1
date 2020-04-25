import java.util.Scanner;

public class Ejercicio06 {
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        while(num >= 0) {    
            System.out.println("El cuadrado del numero " + num + " es: " + num * num);
            System.out.println(""); // Linea vacia
            System.out.println("Introduce un numero");
            num = sc.nextInt();
        }
        
        System.out.println("El numero introduzdo es negativo. Fin");
    }
}
