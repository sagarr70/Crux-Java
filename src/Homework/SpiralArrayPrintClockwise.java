package Homework;

import java.util.Scanner;

public class SpiralArrayPrintClockwise {

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
		int sr=0;
		int er=row-1;
		int sco=0;
		int eco=col-1;
		int print=0;
		while(print<(row*col)) {
			for(int i=sco;i<=eco&&print<(row*col);i++) {
				System.out.print(arr[sr][i]+", ");
				print++;
			}
			sr++;
			for(int i=sr;i<=er&&print<(row*col);i++) {
				System.out.print(arr[i][eco]+", ");
				print++;
			}
			eco--;
			for(int i=eco;i>=sco&&print<(row*col);i--) {
				System.out.print(arr[er][i]+", ");
				print++;
			}
			er--;
			for(int i=er;i>=sr&&print<(row*col);i--) {
				System.out.print(arr[i][sco]+", ");
				print++;
			}
			sco++;
			
		}
		System.out.println("END");
		sc.close();
	}

}
