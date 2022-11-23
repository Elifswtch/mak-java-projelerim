/*
adım1:başla.
adım2:maddenin kütlesini gir. (m)
adım3:maddenin hızını gir. (v)
adım4.maddenin yerden yüksekliğini gir. (h)
adım5:maddenin potansiyel enerjisini hesapla. (m*10*h)
adım6:maddenin kinetik enerjisini hesapla. (1/2)*m*v^2
adım7:sonuçları ekrana yazdır.
adım8:bitir.
 */

import java.util.Scanner;
public class enerji {    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
System.out.println("lütfen kütle giriniz");
double m= input.nextDouble();
System.out.println("lütfen hız giriniz");
double v= input.nextDouble();
System.out.println("lütfen yükseklik giriniz");
double h =input.nextDouble();
double potansiyelenerji = m*10*h;
double kinetikenerji = (1/2)*m*v*v;
System.out.println("potansiyelenerji bulunmuştur"+potansiyelenerji);
System.out.println("kinetikenerji bulunmuştur"+kinetikenerji);

        
        
        
        }
        
        
        
        
        
        
       


        
    }
    
