
package ödev;
import java.util.Scanner;
public class palandromiksayı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b= 0;
        System.out.println("Girmek istediğiniz sayıyı iki defa giriniz");
        int k= input.nextInt();
        int x= input.nextInt();
        
        while (k>0) {
            int a = k%10;
            b = b*10 +a;
            k = k/10;
        }
        System.out.println(b);
        if  (b==x) {
            System.out.println("palandromik sayı"); 
            
        }else {
            System.out.println("değil");
        }
        
        }
        
    }
    

