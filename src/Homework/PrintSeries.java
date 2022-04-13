package Homework;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		sc.close();
		int count=1;
		for(int i=1;i<=n1;) {
			
			if(((3*count)+2)%n2!=0) {
				System.out.println(((3*count)+2));
				i++;
			}
			count++;
		}

	}

}
