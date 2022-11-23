/*
 */

import java.util.Scanner;
public class formül {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int b;
        System.out.println("bir sayı giriniz");
        b=input.nextInt();
        for (int a=0;a<100;a++){
            if (b==(a*a*a)-(a*a)){
                System.out.println("sonuç:"+a);
            }
                }
       
        
                
        
    }
    
}
