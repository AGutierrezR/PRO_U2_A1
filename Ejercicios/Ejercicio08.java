import java.util.Scanner;

public class Ejercicio08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg;

        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        while(num != 0) {   
            msg = (num % 2 == 0) ? "El numero es par" : "El numero es impar";

            System.out.println(msg);            
            System.out.println(""); // Linea vacia
            System.out.println("Introduce un numero");
            num = sc.nextInt();
        }
        
        System.out.println("El numero introducido es 0. Fin");
    }
}
