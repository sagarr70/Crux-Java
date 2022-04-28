package Homework;

import java.util.Scanner;

public class any2any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sb=sc.nextInt();
		int db=sc.nextInt();
		int num=sc.nextInt();
		sc.close();
		if((sb==10)||(db==10))
		{
			
			System.out.print(todb(num,db,sb));
		}
		else {
			int decimal=todecial(num,sb);
			System.out.print(todb(decimal,db,10));
		}

	}

	private static int todb(int decimal, int db,int sb) {
		// TODO Auto-generated method stub
		int ans=0;
		int count=0;
		while(decimal!=0) {
			int rem=decimal%db;
			ans=(int) (ans+rem*Math.pow(sb,count++));
			decimal=decimal/db;
		}
		return ans;
		
		

	}

	private static int todecial(int num, int sb) {
		// TODO Auto-generated method stub
		int ans=0;
		int count=0;
		while(num!=0) {
			int rem=num%10;
			ans=(int) (ans+rem*Math.pow(sb,count++));
			num=num/10;
		}
		return ans;
	}

}
