/*
adım1:başla
adım2: kısa kenarı gir x
adım3:uzun kenarı giriniz y
adım4:çevre hesaplayınız x+x+y+y+
adım5:sonucu ekrana yazdır
adım6:bitir
 */


import java.util.Scanner;
public class dikdörtgen {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
System.out.println("kısa kenarı giriniz");
double x = input.nextDouble();
System.out.println("lütfen uzun kenarı giriniz");
double y = input.nextDouble();
double çevre = x+x+y+y;
System.out.println("çevre bulunmuştur"+çevre);


    }
    
}
