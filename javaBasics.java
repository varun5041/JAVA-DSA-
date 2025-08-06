import java.util.Scanner;

public class javaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        int intNum = (int) num1;
        System.out.println("Float: " + num1);
        System.out.println("Integer: " + intNum);
        sc.close();
    }
}



