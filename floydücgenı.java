
package ödev;
import java.util.Scanner;
public class floydücgenı {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("satır sayısı giriniz");
        int x= input.nextInt();
        System.out.println("FLOYD ÜÇGENİ");
        int s=1;
        for (int i=1; i<=x; i++) {
            for (int j=1; j<=i; j++) {
                System.out.println(s+",");
                s++;
            }
            System.out.println(" ");
        }
        
    }
    
}
