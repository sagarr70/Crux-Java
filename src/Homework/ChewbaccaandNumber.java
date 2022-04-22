package Homework;

import java.util.Scanner;

public class ChewbaccaandNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        long num=sc.nextLong();
        sc.close();
        long ans=0;
        int count=0;
        while(num>9) {
        	long t = num%10;
        	if(9-t>t) {
        		ans=(long) ((long)ans+t*Math.pow(10,count));
        	}
        	else {
        		ans=(long) ((long)ans+(9-t)*Math.pow(10,count));
        	}
        	num=num/10;
        	count++;
        }
        if(num==9||9-num>num) {
        	ans=(long) ((long)ans+num*Math.pow(10,count));
        }
        else {
        	ans=(long) ((long)ans+(9-num)*Math.pow(10,count));
        }
        System.out.println(ans);
	}

}
