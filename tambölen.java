/*
 */
package ödev2;
import java.util.Scanner;
public class tambölen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("a sayısının değerini giriniz");
        int a=input.nextInt();
        
        for(int b=1; a>=b; b++) {
            if (a%b==0){ 
                System.out.println(b+",");
            }
        }
    }
    
}
