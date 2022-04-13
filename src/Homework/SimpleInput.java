package Homework;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int sum=0;
		int n1=sc.nextInt();
		sum+=n1;
		while(sum>=0) {
			System.out.println(n1);
			n1=sc.nextInt();
			sum+=n1;
		}
		sc.close();

	}

}
