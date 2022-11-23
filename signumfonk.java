/*
 */
package ödev2;
import java.util.Scanner;
public class signumfonk {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("x değerini gir");
        int x= input.nextInt();
        double y = Math.pow(x,2 )-5*x+3;
        
        if (y>0){
            System.out.println("fonk pozitif");
        }else if  (y<0){
            System.out.println("fonk negatif");
        }else {
            System.out.println("fonk'un kökü");
                
        }
        
               
    }
    
}
