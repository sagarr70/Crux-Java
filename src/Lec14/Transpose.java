package Lec14;

public class Transpose {

	public static void main(String[] args) {
		int arr[][]= {
				{10 ,20 ,30 ,40 ,50},
				{60 ,70 ,80 ,90 ,100},
				{2 ,4 ,6 ,8 ,10},
				{3 ,5 ,7 ,9 ,11},
				{4,1,3,4,5}};
	arr=transpose(arr);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}

	private static int[][] transpose(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[0].length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		return arr;
	}

}
