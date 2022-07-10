package Homework;

import java.util.Scanner;

public class CanYouReadThis {

	public static void main(String args[]) {
	       Scanner sc=new Scanner(System.in);
	       String input=sc.next();
	       for(int i=0;i<input.length();i++){
	           if(input.charAt(i)>='A'&&input.charAt(i)<='Z'){
	               System.out.println();
	           }
	               System.out.print(input.charAt(i));
	          
	       }
	       sc.close();
	    }

}
