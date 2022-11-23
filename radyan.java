/*
adım1:başla.
adım2:derece cinsinden açı gir.(x)
adım3:girilen açıyı radyana çevir. (x*3,14/180)
adım4:girilen açıyı gradyana çevir. 100 grad 90 derece
adım5.sonuçları ekrana yansıt.
adım6:bitir.
 */

import java.util.Scanner;
public class radyan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
System.out.println("lütfen açıyı derece cinsinden giriniz");       
double x= input.nextDouble();//kullanıcıdan açıyı derece cinsinden aldık
double  radyan = (x*(3.14))/180;
double  gradyan = (x*10/9);
System.out.println("radyan sonuu bulunmuştur"+radyan);
System.out.println("gradyan sonucu bulunmuştur"+gradyan);


        
    }
    
}
