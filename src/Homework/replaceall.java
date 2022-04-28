package Homework;

import java.util.Scanner;

public class replaceall {

	public static void main(String args[]) {
	     Scanner sc=new Scanner(System.in);
	     long num=sc.nextInt();
	     System.out.print(replace(num));
	     sc.close();
	    }
	    public static long replace(long num){
	    	if(num==0) {
	    		return 5;
	    	}
	        long ans=0;
	        long mul=1;
	        while(num!=0){
	            long rem=num%10;
	            if(rem==0){
	                ans=(ans+(mul*5));
	            }else{
	                ans=(ans+(mul*rem));
	            }
	            mul*=10;
	            num=num/10;
	        }
	        return ans;
	    } 

}
