package Homework;

import java.util.Scanner;

public class StringsToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)>='a'&&input.charAt(i)<='z') {
				char ch=Character.toUpperCase(input.charAt(i));
				input=input.substring(0,i)+ch+input.substring(i+1);
			}
			else {
				char ch=Character.toLowerCase(input.charAt(i));
				input=input.substring(0,i)+ch+input.substring(i+1);
			}
		}
		System.out.println(input);
		sc.close();

	}

}
