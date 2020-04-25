import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println(i);  
        }
    }
}
