package Lec7;

public class maximumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {5,6,-1,2,3};
        System.out.println(max(arr));
	}

	private static int max(int[] arr) {
		// TODO Auto-generated method stub
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxi) {
				maxi=arr[i];
			}
		}
		return maxi;
	}

}
