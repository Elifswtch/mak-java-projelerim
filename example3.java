/*
adım1:başla
adım2:toplam=0
adım3:S=1
adım4:eğer S>5 ise git adım8
adım5:toplam=toplam+S
adım6:S=S+1
adım7:git adım4
adım8:toplam yazdır
adım9:bitir
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int toplam=0;
        int S=1;
        while(S<=5){
          
            toplam=toplam+S;
            S=S+1;          
        }
        
        System.out.println("toplam: "+toplam);
    }
    
}
