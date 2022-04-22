package Homework;

import java.util.Scanner;

public class OddandEvenbackinDelhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) {
        	int num=sc.nextInt();
        	int sum_e=0;
        	int sum_o=0;
        	while(num>0) {
        		int digit=num%10;
        		if(digit%2==0) {
        			sum_e+=digit;
        		}
        		else {
        			sum_o+=digit;
        		}
        		num=num/10;
        	}
        	if(sum_e%4==0 || sum_o%3==0) {
        		System.out.println("Yes");
        	}else {
        		System.out.println("No");
        	}
        	
        	t--;
        }
        sc.close();
	}

}
