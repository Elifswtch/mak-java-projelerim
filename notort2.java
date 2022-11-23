
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class notort2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vize;
        do {
            System.out.println("bir sayı giriniz");
            vize = input.nextInt();
        } while (vize < 0 && vize > 100);

        int finall;
        do {
            System.out.println("bir sayı giriniz");
            finall = input.nextInt();
        } while (finall < 0 && finall < 100);

        double ortalama =(double)( vize * 40 / 100) + (finall * 60 / 100);
        System.out.println("ortalamanız:" + ortalama);

        if (80 < ortalama && ortalama <= 100) {
            System.out.println("harf notunuz A");
        } else if (60 < ortalama && ortalama < 80) {
            System.out.println("harf notunuz B");
        } else if (40 < ortalama && ortalama < 60) {
            System.out.println("harf notunuz C");
        } else if (0 < ortalama && ortalama < 40) {
            System.out.println("harf notunuz D");
        }
    }
}


