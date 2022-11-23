/*
 */
import java.util.Scanner;
public class deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
     int bakiye =1000;
        System.out.println("yaptırmak istediğiniz işlemi giriniz:\n1-bakiye görüntüle\n2-para yatırma\n3-para çekme\n4-sistemden çıkış");
        
        int işlem= input.nextInt();
        switch(işlem) {
            case 1:
                System.out.println("bakiyeniz:" +bakiye+ "tl dir");
                break;
                
            case 2:
                System.out.println("yatırılacak miktar giriniz");
                int miktar= input.nextInt();
                System.out.println("yeni bakiyeniz:" +(bakiye+miktar));
                break;
                
            case 3:
                System.out.println("çekilecek miktar giriniz");
                int miktar2 = input.nextInt();
                System.out.println("kalan bakiyeniz:" +(bakiye-miktar2));
                break;
                
            case 4:
                System.out.println("sistemde çıktınız");
                break;
            default:
                     System.out.println("geçersiz işlem değeri girdiniz");
                
        }
    }
    
}
