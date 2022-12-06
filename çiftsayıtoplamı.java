
package ödev;
import java.util.Scanner;
public class çiftsayıtoplamı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y=0;
        
        do { 
            System.out.println("bir tam sayı giriniz");
            x = input.nextInt();
            if (x%2==0) {
                y+=x;
            }
            
        }while (x>0);
        System.out.println("girilen çift sayıların toplamı:"+y);
    }
            }
        
        
    
    

