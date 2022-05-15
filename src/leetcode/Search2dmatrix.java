package leetcode;
//240
public class Search2dmatrix {

	public static void main(String[] args) {
		int arr[][]= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int target=16;
		System.out.println(search(arr,target));

	}

	private static boolean search(int[][] arr,int target) {
		int i=0;
		int j=arr[0].length-1;
		while(i<arr.length && i>=0 && j>=0 && j<arr[0].length) {
			if(arr[i][j]==target)
			{
				return true;
			}
			else {
				if(arr[i][j]>target) {
					j--;
				}
				else {
					i++;
				}
			}
		}
		return false;
	}

}
