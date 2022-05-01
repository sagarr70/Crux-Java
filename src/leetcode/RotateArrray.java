package leetcode;

public class RotateArrray {
	public static void main(String[] args) {
		int[] nums= {2,3,4};
		int k=2;
		rotate(nums,k);
		
	}

	 public static void rotate(int[] nums, int k) {
	        k=k%nums.length;
	        nums=reverse(nums,0,nums.length-1);
	        nums=reverse(nums,k,nums.length-1);
	        nums=reverse(nums,0,k-1);
	       for(int i=0;i<nums.length;i++) {
	    	   System.out.print(nums[i]+" ");
	       }
	        
	    }
	    public static int[] reverse(int[] arr,int start,int end){
	        while(start<end){
	            int temp=arr[start];
	            arr[start]=arr[end];
	            arr[end]=temp;
	            start++;
	            end--;
	        }
	        return arr;
	    }

}
