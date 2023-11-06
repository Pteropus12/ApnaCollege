import java.util.*;
public class TrapRainWater {
    public static int rainTrapSelf(int height[]){ //4 2 0 6 3 2 5

        int n= height.length ; //7
        //calculate left max boundary
        int[] leftMax = new int[height.length];  //new array
        leftMax[0] = height[0];  // for leftmost point leftmax is itself
        for (int i=1; i<n ; i++) {  //0
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);  //
        }

        //calculate right max boundary
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int waterLevel = 0;
        int trappedWater=0;
        //loops
        for(int i=0 ; i<n ; i++){
            //waterLevel = min(leftmax bound, rightmax bound)
            waterLevel= Math.min(leftMax[i],rightMax[i]);
            //trapperWater = (waterLevel - height[i])
            trappedWater+=(waterLevel-height[i]);
        }
        return trappedWater;


    }

    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(rainTrapSelf(height));
    }

}
