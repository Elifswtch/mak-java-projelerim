
package ödev;
import java.util.Scanner;
public class chenasalı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi= input.nextInt();
        int sayac = 0;
        int sayac2= 0;
        
        for(int i=2 ; i<sayi ; i++) 
        {
            if (sayi%1 ==0) {
                sayac++;
            }
        }
        if(sayac==0 ) {
            System.out.println(sayi+ "Asal bir sayıdır.");
        }
        
        for(int i=2; i<(sayi+2); i++)
        {
            if(sayi%i==0) {
                sayac2++;
            }
            if (sayac==0 && sayac2==0) {
                System.out.println("chen asalı");
            }else {
                System.out.println("chen asalı değil");
            }
            }
        }
                
    }
    

