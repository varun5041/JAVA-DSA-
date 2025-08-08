import java.util.*;
public class rainwatertrap {
    public static int calculaterainwater(int height[]){
        int n =height.length;
        //calculate left max boundary
        int leftmax[] = new int[n]; 
        leftmax[0]=height[0];//nothing in left(1st bar)
            for(int i=1 ;i<n; i++){
                leftmax[i] = Math.max(height[i],leftmax[i-1]);
            }

        //calculate right max boundary
        int rightmax[] = new int[n];
        rightmax[rightmax.length-1]=height[n-1];//nothing in right(last bar)
            for(int i=n-2;i>=0;i--){
                rightmax[i]= Math.max(height[i],rightmax[i+1]);
            }

        int trappedWater=0;
        //loop
        for(int i=0 ; i<n ; i++){
            int waterlvl=Math.min(leftmax[i],rightmax[i]);
            trappedWater+=waterlvl-height[i];
        }
            return trappedWater;
    }

    
        public static void main(String[] args){
        int height[] = {4,0,4};
        int Result=calculaterainwater(height);
        System.out.println("TOTAL RAINWATER TRAPPED:" + Result); 
        }
}
