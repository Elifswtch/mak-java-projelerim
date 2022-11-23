/*

 */
import java.util.Scanner;
public class hafta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    int sayı=input.nextInt();
        System.out.println("1 ile 7 arasında bir sayı giriniz");
        if (sayı==1) {
            System.out.println("pazartesi");
    } else if (sayı==2){
            System.out.println("salı");
    } else if (sayı==3){
            System.out.println("çarşamba");
    } else if (sayı==4){
            System.out.println("perşembe");
    } else if (sayı==5){
            System.out.println("cuma");
    } else if (sayı==6){
            System.out.println("cumartesi");
    } else if (sayı==7){
            System.out.println("pazar");
    } else {
            System.out.println("1 ile 7 arasında bir sayı girmediniz");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
