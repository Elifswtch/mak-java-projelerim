/*
 */
import java.util.Scanner;
public class ikitamsayınınkaretoplamı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("bir sayı giriniz");
        int x= input.nextInt();
        int a,b;
        for (a=0; a<x; a++) {
            for (b=0; b<x; b++) {
                if (x== (a*a + b*b)){
                    System.out.println(a + "ile" +b);
                }
            }
        }
    }
    
}
