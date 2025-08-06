import java.util.Scanner;
public class linearsearch {

    public static void displayarr(int a[]){
         for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
            
        }
        System.out.println();
    }

 public static void linearsearch(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Number " + n + " found at index " + i);
                return;
            }
        }
        System.out.println("Number " + n + " not found in the array.");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = {22,44,99,66,69,55};
        int b[] = {33,44,22,11,9,8,3};
        int c[] = {1,2};
          displayarr(a);
          displayarr(b);
          displayarr(c);

        System.out.println("enter number to search");
        int n =sc.nextInt();
        linearsearch(n,a);
        linearsearch(n,b);
        linearsearch(n,c);
       
    }
}
