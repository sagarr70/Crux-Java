package Homework;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		sc.close();
		int ans=0;
		while(n!=0) {
			if(n%10==k) {
				ans++;
			}
			n=n/10;
			
		}
		System.out.println(ans);

	}

}
