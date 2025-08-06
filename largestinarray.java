import java.util.*;
public class largestinarray {

    public static int getlargest(int a[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 elements:");
        int a[] = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("ho gaye 5 element bas ab!");
        int largest = getlargest(a); // Store the result
        System.out.println("largest element is: " + largest);
        sc.close();
    }
}