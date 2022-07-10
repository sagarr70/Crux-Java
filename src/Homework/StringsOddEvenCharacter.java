package Homework;

import java.util.Scanner;

public class StringsOddEvenCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String input = sc.next();
		for(int i=0;i<input.length();i++) {
			if(i%2==0) {
				char ch= (char) (input.charAt(i)+1);
				input= input.substring(0,i)+ch+input.substring(i+1);
			}
			else {
				char ch= (char) (input.charAt(i)-1);
				input= input.substring(0,i)+ch+input.substring(i+1);
			}
			
			
		}
		System.out.println(input);
        sc.close();
	}

}
