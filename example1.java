/*
adım1: başla
adım2:sayıyı klavyeden al
adım3:eğer sayı %2=0 ise "çift" yazdır 
adım4:aksi takdirde "tek" yazdır
adım5.bitir

 */
import java.util.Scanner;

public class example1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz");
        int sayi = input.nextInt();
        if (sayi % 2 == 0) {
            System.out.println(sayi + " çift sayıdır");
        } else {
            System.out.println(sayi + "tek sayıdır");
        }
    }
}
