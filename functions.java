import java.lang.Math;
import java.util.Scanner;
public class functions {
    public static void printhello() {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0; 
        }
        return a / b;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isPrime1(int n) {
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int n) {  //optimized version
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
 
    public static void primenumberinrange(int range) {
    for(int i = 2; i<=range;i++){
        if(isPrime1(i)){
            System.out.println(i);
        }
    }
    System.out.println("are prime numbers in the range of " + range);
}

    public static int binomialcoeff(int k,int r){

        return (factorial(k))/(factorial(r) * factorial(k-r));
    }

    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter a number for factorial and its prime number chck also:");
        int n = sc.nextInt();
        System.out.println("Enter a number k and r for binomial coeff:");
        int k = sc.nextInt();
        int r = sc.nextInt();

        //simple operations
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
        printhello();
        //factorial checker
        factorial(n);

        //binomial coefficient checker
        binomialcoeff(k, r);
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        System.out.println("Binomial Coefficient: " + binomialcoeff(k, r));
        if(r==0 || r==k){
            System.out.println("Binomial Coefficient is 1");
        } else if(r>k){
            System.out.println("Binomial Coefficient is 0");
        } else {
            System.out.println("Binomial Coefficient is: " + binomialcoeff(k, r));
        }

        //prime numbe rcheckers 2 methods
        if (isPrime2(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        if (isPrime1(n)) {
            System.out.println(n + " is a prime number (method 1).");
        } else {
            System.out.println(n + " is not a prime number (method 1).");
        }

        //prime number in range
        System.out.println("enter range to chekck prime numbers");
        int range = sc.nextInt();
        primenumberinrange(range);
        sc.close();

    }

    
}
