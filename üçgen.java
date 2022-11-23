/*
adım1:başla
adım2:kullanıcıdan taban uzunluğu ve o tabana ait yüksekliği al.
adım3.üçgenini alanını hesapla. (a*h/2)
adım4:sonucu ekrana yazdır.
adım5:bitir.
 */

import java.util.Scanner;
public class üçgen {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
System.out.println("lütfen üçgenin kenar uzunluğunu giriniz");
int a=input.nextInt();//kullanıcıdan taban uzunluğunu aldık
System.out.println("lütfen yüksekliği giriniz");
int b=input.nextInt ();//kullanıcıdan yükseklik bilgilerini aldık
int alan =(a*b)/2;
System.out.println("üçgenin alanı :"+alan );
        
    }
    
}
