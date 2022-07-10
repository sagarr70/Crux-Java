package Homework;

import java.util.Scanner;

public class matrixsearch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		int k=sc.nextInt();
		int i=0;
		int j=col-1;
		int flag=-1;
		while(i>=0 && i<arr.length && j>=0 && j<arr[0].length) {
			if(arr[i][j]==k) {
				System.out.println(1);
				flag=0;
				break;
			}
			else {
				if(arr[i][j]>k) {
					j--;
				}
				else {
					i++;
				}
			}
			
		}
		if(flag!=0) {
			System.out.println(0);
		}
        sc.close();
	}

}
