package Homework;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int ans=0;
        int count=0;
        while(num!=0) {
        	int rem=num%8;
        	ans=(int) (ans+(rem*Math.pow(10,count)));
        	count++;
        	num=num/8;
        }
        System.out.println(ans);
	}

}
