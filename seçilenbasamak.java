/*
 */
package ödev2;
import java.util.Scanner;
public class seçilenbasamak {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        
        System.out.println("payı giriniz");
         int a= input.nextInt();
         System.out.println("paydayı giriniz");
         int b = input.nextInt();
         System.out.println("bölümün kacıncı basamagının degerının yazdırılmasını ıstıyorsunuz");
         int n= input.nextInt();
         int c=a / b;
         int k = 0;
         for( int i=1; n<=i; i++) {
             
             k = c % 10;
             c = c / 10;
         }
         System.out.println("k");
             
    }
    
}
