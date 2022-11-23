/*
 */

import java.util.Scanner;
public class satırsutun {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("satır sayısı: ");
        int row = input.nextInt();
        System.out.println();
        System.out.print("sutun sayısını: ");
        int col= input.nextInt();
        
        for (int i=1; i<=row; i++ ) {
            for (int j=1; j<=col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
