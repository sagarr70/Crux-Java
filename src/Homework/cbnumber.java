package Homework;

import java.util.Scanner;

public class cbnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("unused")
		int n=sc.nextInt();
		
		String input=sc.next();
		int ans=0;
		boolean visited[]=new boolean[input.length()]; //false by default
		for(int i=1;i<=input.length();i++) {
			for(int j=0;j<=input.length()-i;j++) {
			     long num= Long.parseLong(input.substring(j, j+i));
			     if(checkcb(num)==true) {
			    	
					if(isvisited(j,j+i-1,visited)==false) {
			    		 ans++;
			    		 System.out.println(num);
			    		 for(int k=j;k<=j+i-1;k++) {
			    			 visited[k]=true;
			    		 }
			    	 }
			     }
			}
		}
		System.out.println(ans);
		
         sc.close();
	}

	private static boolean isvisited(int i, int j,boolean visited[]) {
		for(int k=i;k<=j;k++) {
			if(visited[k]==true) {
				return true;
			}
		}
		return false;
	}

	private static boolean checkcb(long num) {
		if(num==0||num==1) {
			return false;
		}
		else {
			int nums[]= {2,3,5,7,11,13,17,19,23,29};
			for(int i=0;i< nums.length;i++) {
				if(num==nums[i]) {
					return true;
				}
			}
			for(int i=0;i<nums.length;i++) {
				if(num%nums[i]==0) {
					  return false;
				}
			}
			return true;
		}
	}

}
