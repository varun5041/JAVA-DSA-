import java.util.Scanner;
//call by value method
public class swapfunction{

    public static void swap1(int a ,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: x = " + a + ", y = " + b); 
        }

    public static void main(String args[]){
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x:");
        x = sc.nextInt();
        System.out.print("Enter y:");
        y = sc.nextInt();
        System.out.println("Before swap: x = " + x + ", y = " + y);
        swap1(x, y); //change x,y values in function only
        System.out.println("Before swap: x = " + x + ", y = " + y); //values again become same
        sc.close();
    }

    











}