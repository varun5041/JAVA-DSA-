import java.util.Scanner;

public class reversearray {
    public static void displayarr(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6};
        System.out.println("before reversal");
        displayarr(a);

        // reversal logic
        int first = 0, last = a.length - 1;
        int temp;
        while(first<last){
            if(first == last){
                break;
            }
            temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;
            last--;

        }
        System.out.println("after reversal:");
        displayarr(a);
        

}
}