/*
adım1:başla
adım2:iletken direncini gir. (a)
adım3:iletkenin akımını gir. (b)
adım4:gerilim hesapla. (a*b)
adım5:sonucu ekrana yazdır.
adım6:bitir.
 */


 import java.util.Scanner;
public class gerilim {
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
System.out.println("lütfen iletkenin direncini giriniz");
double a = input.nextDouble();
System.out.println("lütfen iletkenin akımını giriniz");
double b = input.nextDouble();
double gerilim = a*b ;
System.out.println("gerilim bulunmuştur"+gerilim);



    
    
    }
    
}
