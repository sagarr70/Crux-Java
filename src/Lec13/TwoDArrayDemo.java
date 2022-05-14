package Lec13;

public class TwoDArrayDemo {
// collection of 1D array = 2d array (int[m][n] -> m+1 1D arrays
	public static void main(String[] args) {
		int[][] arr=new int[4][3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        //set
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[i].length;j++) {
        		arr[i][j]=(i+j+1)*10;
        	}
        }
        //print
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[i].length;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
