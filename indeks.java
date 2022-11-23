/*
adım1:başla
adım2:kilo gir a
adım3:boy gir b
adım4:vücut kitle indeksi hesapla  a/b*b
 */

import java.util.Scanner;
public class indeks {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

System.out.println("lütfen kilonuzu giriniz");
double a = input.nextDouble();
System.out.println("lütfen boyunuzu giriniz");
double b = input.nextDouble();
double indeks= a/b*b;
System.out.println("indeks bulunmuştur"+indeks);
    }
    
}
