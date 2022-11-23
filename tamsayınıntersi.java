/*
 */
package ödev2;
import java.util.Scanner;
public class tamsayınıntersi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("a sayısını giriniz");
        int a= input.nextInt();
        int b=0;
        while (a>0) { 
            int k= a%10;
            b=b*10+k;
            a=a/10;
        }
        System.out.println("b");
    }
    
}
