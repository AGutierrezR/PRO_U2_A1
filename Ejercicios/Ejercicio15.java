import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, 
            sumaTotal = 0;
        
        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduzca número: "); 
            num = sc.nextInt();
            sumaTotal += num; 
        }
        
        System.out.println("La suma total es de: "+ sumaTotal);
    }
}
