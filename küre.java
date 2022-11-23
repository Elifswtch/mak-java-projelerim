/*
adım1:başla.
adım2:kullanıcıdan küreye ait yarıçap bilgisini al. (r)
adım3:küre hacmini hesapla. (4/3)*(3,14)*r^3
adım4:küre alanını hesapla.  4*(3,14)*r^2
adım5:sonuçları ekrana yansıt.
adım6:bitir.
 */
import java.util.Scanner;
public class küre {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        
System.out.println("lütfen r değerini giriniz");
double r= input.nextDouble();//kullanıcıdan kürenin yarıçap uzunluğunu aldık
double hacim = (4/3)*(3.14)*r*r*r;
double alan = (4*3.14)*r*r;
System.out.println("hacim sonucu bulunmuştur"+hacim);
System.out.println("alan sonucu bulunmuştur"+alan);
    }
    
}
