/*
adım1:başla
adım2:vize notunu gir (a)
adım3:final notunu gir (b)
adım4:not ortalaması al a*(0.4)+b*(0.6)
adım5:sonucu ekrana yazdır
adım6.bitir
 */

import java.util.Scanner;
public class notort {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
System.out.println("lütfen vize notunu giriniz");
double a = input.nextDouble();
System.out.println("lütfen final notunu giriniz");
double b = input.nextDouble();
double ortalama = a*(0.4)+b*(0.6) ;
System.out.println("ortalama bulunmuştur"+ortalama);


        

    }
    
}
