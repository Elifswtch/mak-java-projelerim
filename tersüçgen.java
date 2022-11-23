
/*
 */
import java.util.Scanner;
public class tersüçgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("kaç satır oluşturulmasının istiyorsunuz");
        int x= input.nextInt();
        for (int i=1; i<=x; i++) {
            for (int j=x; j>=i; j--){
                System.out.print("o");
            }
            System.out.println();
        }
    }
    
    
    
    
}
