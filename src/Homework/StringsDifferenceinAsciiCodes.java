package Homework;

import java.util.Scanner;

public class StringsDifferenceinAsciiCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.print(input.charAt(0));
        for(int i=1;i<input.length();i++) {
        	int diff=input.charAt(i)-input.charAt(i-1);
        	System.out.print(diff);
        	System.out.print(input.charAt(i));
        }
        sc.close();
	}


}
