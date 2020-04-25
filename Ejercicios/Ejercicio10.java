import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg;
        
        System.out.println("Introduce un numero N");
        int N = sc.nextInt();
        
        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        while(N != num) {
            msg = (num < N) ? "El numero es mayor" : "El numero es menor";

            System.out.println(msg);
            System.out.println("");
            System.out.println("Introduce un numero");
            num = sc.nextInt();
        }
        
        System.out.println("Has acertado el numero");
    }
}
