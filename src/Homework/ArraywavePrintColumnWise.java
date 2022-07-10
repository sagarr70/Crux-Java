package Homework;

import java.util.Scanner;

public class ArraywavePrintColumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<arr[0].length;i++) {
			if(i%2!=0) {
				for(int j=(arr.length)-1;j>=0;j--) {
					System.out.print(arr[j][i]+", ");
				}
			}
			else {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[j][i]+", ");
				}
			}
		}
		System.out.print("END");
        sc.close();
	}

}
