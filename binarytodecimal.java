import java.util.Scanner;
import java.lang.Math;

public class binarytodecimal {

    
    public static void btd(int binarynum) {
        int decimal = 0;
        
        for (int pow = 0   ;     binarynum > 0   ; binarynum /= 10, pow++) {
            int LD = binarynum % 10; 
            decimal += LD * (int) Math.pow(2, pow); 
        }

        System.out.println("Decimal value is: " + decimal);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int binarynum = sc.nextInt();
        if( binarynum%10 == 0 || binarynum%10 == 1) {
            btd(binarynum); 
        } else {
            System.out.println("Invalid binary number");
            break;
        } 

        sc.close();
    }
}
