package Lec8;

public class Kadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,3,6,7,5};
		int max_subarray_sum=kadanes(arr);
		System.out.println(max_subarray_sum);

	}

	private static int kadanes(int[] arr) {
		int cur_sum=0;
		int max_sum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			cur_sum+=arr[i];
			max_sum=Math.max(max_sum, cur_sum);
			if(cur_sum<0) {
				cur_sum=0;
				
			}
			
		}
		return max_sum;
	}

}
