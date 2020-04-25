import java.util.Scanner;


public class Ejercicio12 {
    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        String msg;
        double suma = 0,
               media;
        int n = 0,
            num;
        
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        
        while(num >= 0) {
            n++;
            suma += num;
                       
            System.out.println("Introduce un numero");
            num = sc.nextInt();
        }

        media = (n != 0) ? suma / n : 0;
        msg = (n == 0) ? 
                "No se ha introducido ningun numero para calcular promedio \n" :            
                "Se ha introducido numero negativo. La media de los numeros introducidos es: %.2f \n";
        
        System.out.printf(msg, media);
    }
}
