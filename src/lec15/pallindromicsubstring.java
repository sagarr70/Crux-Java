package lec15;

import java.util.Scanner;

public class pallindromicsubstring {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String str=sc.next();
	        sc.close();
	        for(int i=0;i<str.length();i++) {
	        	for(int j=i;j<str.length();j++) {
	        		String su= str.substring(i, j+1);
	        		System.out.println(checkpallindrome(su)+" "+su);
	        		
	        	}
	        }
	       
	       
		}

		private static boolean checkpallindrome(String str) {
			int j=str.length()-1;
	        for(int i=0;i<j;i++) {
	        	if(str.charAt(i)!=str.charAt(j)) {
	        		return false;
	        	}
	        	j--;
	        }
	        return true;
		}
}
