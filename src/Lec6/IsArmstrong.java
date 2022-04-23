package Lec6;

import java.util.Scanner;

public class IsArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        sc.close();
	        boolean ans=isarmstrong(num);
	        System.out.print(ans);

	    }
	    public static boolean isarmstrong(int num){
	    	String s=Integer.toString(num);
	        int length= s.length();
	        int sum=0;
	        int a=num;
	        while(num>0){
	            sum+=Math.pow(num%10,length);
	            num=num/10;
	        }
	        if(sum==a){
	            return true;
	        }
	        return false;
	    }

	}


