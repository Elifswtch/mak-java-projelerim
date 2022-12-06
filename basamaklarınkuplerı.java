
package ödev;
import java.util.Scanner;
public class basamaklarınkuplerı {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int x =  input.nextInt();
        int xyedek= x;
        int xyedek2= x;
        int sayac=0;
        int a , b= 0;
        while (xyedek > 0) {
            xyedek /= 10;
            sayac++;   
        }
        while (xyedek2>0) {
            a = xyedek2 % 10;
            b += (int) Math.pow(a, sayac);
            xyedek2 /= 10;
        }
        
        System.out.println("b");
        
        if ( x==b ) {
            System.out.println("Girdiğiniz sayı armstrong sayısıdır.");
        }else {
            System.out.println("Girdiğiniz sayı armstrong sayısı değildir.");
        }
    }
    
}
