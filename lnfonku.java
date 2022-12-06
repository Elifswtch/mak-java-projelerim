
package ödev;
import java.util.Scanner;
public class lnfonku {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("bir sayı giriniz");
        int x= input.nextInt();
        int t=0;
        for (int i=0; i<x-1; i++) {
            t= t+1/((2*i+1)*(2*i+2));
        }
        System.out.println("sonuc:\t"+t);
        }
        
    }
    

