public class subarraysprint {
    public static void main(String args[]){
        int a[]={2,4,3,9,7,6};
        for(int i=0;i<=a.length-1;i++){
            System.out.println("subarrays of" + a[i] + ":");
             if(i==a.length-1){
                        System.out.println("[" + a[i] + "]");
                    }
            for(int j=i+1;j<=a.length-1;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                
                    System.out.print(a[k]);
                    if(k!=j){
                        System.out.print(",");
                    }
                    

                }
                System.out.println("]");
            }
        }
       
    }
}
