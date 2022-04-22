package Homework;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int ans=0;
        int count=0;
        while(num!=0) {
        	int rem=num%10;
        	ans=(int) (ans+rem*Math.pow(2,count));
        	num=num/10;
        	count++;
        }
        System.out.println(ans);
	}

}
