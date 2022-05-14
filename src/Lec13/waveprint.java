package Lec13;

import java.util.Scanner;

public class waveprint {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
        wavedisplay(arr);
        sc.close();
	}

	private static void wavedisplay(int[][] arr) {
		for(int j=0;j<arr[0].length;j++)
		if(j%2==0) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		else {
			for(int i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
		
	}
	
}
