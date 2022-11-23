/*
 */
package ödev2;

import java.util.Scanner;
public class çarpma {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int A,B,çarpım;
        System.out.println("ilk sayıyı giriniz");
        A= input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        B = input.nextInt();
        çarpım = 0 ;
        while (1 <= B){
            çarpım = çarpım + A ;
            B = B-1 ;
        }
        
          System.out.println("çarpım sonucu:"+çarpım);      
    }
    
}
