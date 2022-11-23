/*
 */

import java.util.Scanner;
public class çarpımtablosu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        for (int i=1; i<10; i++) {
            for (int j=1; j<=10; j++){
                int sonuç =i*j ;
                System.out.println(i + "*" +j +"="+(i*j));
            } 
        }
        
    }
    
}
