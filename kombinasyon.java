/*
*/
package ödev2;
import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("kümenizin eleman sayısını giriniz");
        int n= input.nextInt();
        System.out.println("eleman sayısını belirttiğiniz kümenin kaçlı kombinasyonlarını almak istediğinizi girin");
        int r= input.nextInt();
        int f1=1;
        int f2=1;
        int f3=1;
        
        for(int a=1; n>=a; a++) {
            f1 = f1*a;
        }
        for(int b=1; r>=b; b++) {
            f2=f2*b;
        }
        for(int c=1; (n-r)>=c; c++) {
            f3=f3*c;
        }
        int k = f1 / (f2*f3);
        {  System.out.println(n + "\telemanlı kümenizin\t"+r+ "\tli kombinasyonu:\t" +k);
        }
    }
    
}
