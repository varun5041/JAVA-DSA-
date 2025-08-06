import java.util.Scanner;
import java.lang.Math;

public class decimaltobinary {
public static void dtb(int decimalnum)
{
int remainder=0;
int binary=0;  
int power=0;
while(decimalnum > 0) {
    remainder = decimalnum%2;
    binary=binary+remainder*(int)Math.pow(10,power);
    power++;
    decimalnum = decimalnum/2;
}
System.out.println("Binary value is: " + binary);
}
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a decimal number:");
    int decimalnum = sc.nextInt();
    decimaltobinary.dtb(decimalnum);
    sc.close();
}
}




    
