package Homework;

import java.util.Scanner;

public class StringCompressioncompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        String input=sc.next();
        char ch=input.charAt(0);
        int count=0;
        for(int i=0;i<input.length();i++) {
        	if(input.charAt(i)==ch) {
        		count++;
        	}
        	else {
        		System.out.print(input.charAt(i-1));
                if(count>1){
        		System.out.print(count);}
        		ch=input.charAt(i);
        		count=1;
        
                 }
        	}
        System.out.print(ch);
        if(count>1){
		System.out.print(count);}
        sc.close();
	}

}
