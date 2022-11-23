/*
 */
package ödev2;

import java.util.Scanner;
public class tektoplam {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
 int toplam,N,A;
        System.out.println("'N' sayısının değerini giriniz");
 N = input.nextInt();
   A = 1 ;
     toplam = 0;
         
        while (A<=N)  {
            toplam = toplam +A;
            A = A  + 2 ;
        }
        System.out.println(toplam); 
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
