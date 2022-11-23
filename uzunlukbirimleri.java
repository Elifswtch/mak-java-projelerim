/*

 */
package ödev2;
import java.util.Scanner;
public class uzunlukbirimleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("metre cinsinden bir değer giriniz");
        double m = input.nextDouble();
        System.out.println("çevirmek istediğiniz ölçü birimini seçiniz:/n1-cm/n2-mm/n3-dm/n4-km");
        int seçim= input.nextInt();
        
        switch (seçim){
            case 1 :
                System.out.println(m*100 +"cm");
                break;
            case 2 :
                System.out.println(m*1000 +"km");
                break;
            case 3 :
                System.out.println(m*10 +"dm");
                break;
            case 4 :
                System.out.println(m/1000 +"km");
                
            
        }
        
    }
    
}
