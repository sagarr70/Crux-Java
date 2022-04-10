package Lec4;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		Scanner sc= new Scanner(System.in);
		int k=sc.nextInt();
		sc.close();
		int num=1;
		
		while(num<=k) {
			int c=a+b;
//			System.out.println(a);
			a=b;
			b=c;
			num++;
        
		}
		System.out.println(a);

	}

}
