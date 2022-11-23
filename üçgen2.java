/*
 */

import java.util.Scanner;

public class üçgen2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kenar1, kenar2, kenar3;
        System.out.println("birinci kenar uzunluğunu giriniz");
        kenar1 = input.nextInt();
        System.out.println("ikinci kenar uzunluğunu giriniz");
        kenar2 = input.nextInt();
        System.out.println("üçüncü kenar uzunluğunu giriniz");
        kenar3 = input.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("eşkenar üçgen");
        } else if ((kenar1 != kenar2 && kenar1 == kenar3)
                || (kenar1 == kenar2 && kenar1 != kenar3)
                || (kenar2 == kenar3 && kenar2 != kenar3)) {
                    
            System.out.println("ikizkenar üçgen");
        } else {
            System.out.println("çeşitkenar üçgen");
        }

    }

}
