package Homework;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
		int[] ticket=new int[4];
		for(int i=0;i<4;i++) {
			ticket[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		int m=sc.nextInt();
		int rikshaw[]=new int[n];
		int cab[]=new int[m];
		for(int i=0;i<n;i++) {
			rikshaw[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			cab[i]=sc.nextInt();
		}
		System.out.println(minfare(ticket,n,m,rikshaw,cab));
		t--;
		}
		sc.close();

	}

	private static int minfare(int[] ticket, int n, int m, int[] rikshaw, int[] cab) {
		
		int min_rikshaw=0;
		for(int i=0;i<rikshaw.length;i++) {
			min_rikshaw+=Integer.min((rikshaw[i]*ticket[0]), ticket[1]);
		}
		min_rikshaw=Integer.min(min_rikshaw, ticket[2]);
		int min_cab=0;
		for(int i=0;i<cab.length;i++) {
			min_cab+=Integer.min((cab[i]*ticket[0]), cab[1]);
		}
		min_cab=Integer.min(min_cab, ticket[2]);
		int ans=Integer.min(min_cab+min_rikshaw,ticket[3]);
		return ans;
		
	}

}
