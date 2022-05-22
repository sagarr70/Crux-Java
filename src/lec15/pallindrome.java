package lec15;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(checkpallindrome(str));
        sc.close();
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
