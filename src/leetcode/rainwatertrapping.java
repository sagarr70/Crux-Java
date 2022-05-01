package leetcode;

public class rainwatertrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));

	}
	public static  int trap(int[] height) {
        int left_max[]=new int[height.length];
        int right_max[]=new int[height.length];
        left_max[0]=height[0];
        right_max[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            left_max[i]=Integer.max(left_max[i-1],height[i]);
        }
        for(int i=height.length-2;i>=0;i--){
           right_max[i]=Integer.max(right_max[i+1],height[i]);
        }
        int ans=0;
        for(int i=0;i<height.length;i++){
            ans+=Math.abs(height[i]-(Integer.min(left_max[i],right_max[i])));
        }
        return ans;
    }

}
