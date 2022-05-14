package Lec13;

public class spiralprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][]= {
//				{10 ,20 ,30 ,40 ,50},
//				{60 ,70 ,80 ,90 ,100},
//				{2 ,4 ,6 ,8 ,10},
//				{3 ,5 ,7 ,9 ,11}};
		int arr[][]= {{1,2,3,4},
				      {4,5,6,7},
				      {9,10,11,9}
				      };
		display(arr);
		
	}

	private static void display(int[][] arr) {
		int sr=0;
		int sc=0;
		int er=arr.length-1;
		int ec=arr[0].length-1;
		int count=0;
		int total=arr.length*arr[0].length;
		while(count<total) {
			for(int i=sc;i<=ec && count<total;i++) {
				System.out.print(arr[sr][i]+" ");
				count++;
			}
			sr++;
			for(int i=sr;i<=er&& count<total;i++) {
				System.out.print(arr[i][ec]+" ");
				count++;
			}
			ec--;
			for(int i=ec;i>=sc&& count<total;i--) {
				System.out.print(arr[er][i]+" ");
				count++;
			}
			er--;
			for(int i=er;i>=sr&& count<total;i--) {
				System.out.print(arr[i][sc]+" ");
				count++;
			}
			sc++;
			
		
	   }

	}

}
