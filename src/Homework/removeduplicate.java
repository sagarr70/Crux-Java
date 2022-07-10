package Homework;

import java.util.Scanner;

public class removeduplicate {

	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc=new Scanner(System.in);
	        String str=sc.next();
	        System.out.println(str.length());
	        String ans="";
	        char ch=str.charAt(0);
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)!=ch){
	                ans+=ch;
	                ch=str.charAt(i);
	            }
	        }
	        ans+=ch;
	        System.out.print(ans);
	        sc.close();
	    }

}
