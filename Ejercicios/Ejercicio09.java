import java.util.Scanner;

public class Ejercicio09 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg;
        
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int cuenta = 1;

        while(num >= 0) {               
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            cuenta++;
        }
        
        msg = String.format("El numero introducido menor que 0. Se han introducido %d numeros", cuenta);
        System.out.println(msg);
    }
}
