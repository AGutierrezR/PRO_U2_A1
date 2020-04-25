import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = "Se ha introducido 0. La suma de los valores introducidos es: %d \n";
        int suma = 0;
        
        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        while(num != 0) {
            suma += num;
                       
            System.out.println("Introduce un numero");
            num = sc.nextInt();
        }
        
        System.out.printf(msg, suma);
        System.out.println("Se ha introducido 0. La suma de los valores introducidos es: " + suma); 
    }
}
