package Homework;

import java.util.Scanner;

public class AlexGoesShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		while(t>0) {
			int money=sc.nextInt();
			int type=sc.nextInt();
			System.out.println(check(a,money,type));
			
			
			t--;
		}
		sc.close();

	}

	private static String check(int[] a, int money, int type) {
		for(int i=0;i<a.length;i++) {
			if(money%a[i]==0) {
				type--;
			}
			if(type==0) {
				return "Yes";
			}
		}
		return "No";
	}

}
