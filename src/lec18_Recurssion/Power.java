package lec18_Recurssion;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(power(a,b));
		sc.close();

	}

	private static int power(int a, int b) {
		if(b==1) {
			return a;
		}
		
		return a* power(a,b-1);
	}

}
