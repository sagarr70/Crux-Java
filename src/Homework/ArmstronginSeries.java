package Homework;

import java.util.Scanner;

public class ArmstronginSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		for(int i=num1;i<=num2;i++) {
			if(checkarmstrong(i)) {
				System.out.println(i);
			}
		}
		sc.close();
		

	}

	private static boolean checkarmstrong(int i) {
		// TODO Auto-generated method stub
		int leng=0;
		String s= Integer.toString(i);
		leng=s.length();
		int sum=0;
	    int k=i;
	    while(i>0) {
	    	sum=(int) (sum+Math.pow(i%10,leng));
	    	i=i/10;
	    }
	    
		return k==sum;
	}

}
