import java.util.Scanner;
public class binarysearch {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a[]={2,4,8,16,32,64};
        System.out.print("enter a number to search: ");
        int n=sc.nextInt();
        int start=0;
        int end=a.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(a[mid]==n){
                System.out.println(n+"found at index :" + mid);
                return;
            }
            else if(a[mid]>n){
                end=mid-1;
                
            }
            else{
                start=mid+1;
                
            }
        }
        
                System.out.println("number not found in array!");
            
        sc.close(); 
        }
        
     }

