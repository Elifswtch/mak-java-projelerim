
package ödev;
import java.util.Scanner;
public class pellsayıları {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("terim sayısını giriniz");
        int n= input.nextInt();
        
        
        
        int a = (int) (1+ Math.pow(2,.05));
        int b = (int) (1- Math.pow(2,0.5));
        
        for (int i=0;i<=n;i++) {
        
        System.out.print((Math.pow(a,i) - Math.pow(b,i))/(2*Math.pow(2,0.5))+",");
    }
        
    }
    
}
