package Homework;

import java.util.Scanner;

public class BostonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		if(boston(num)) 
		{
			System.out.println("1");
		}
		else 
		{
			System.out.println("0");
		}

	}
	private static int digisum(int n) {
		
		int digitsum=0;
		int k=n;
		while(k!=0) {
			digitsum+=k%10;
			k=k/10;
		}
		return digitsum;
	}

	private static boolean boston(int num) {
		// TODO Auto-generated method stub
	    int digitsu=digisum(num);
		int primefactorsum=0;
		int c = 2;
		int n=num;
        while (n > 1) {
            if (n % c == 0) {
            	if(c>9) {
            		primefactorsum+=digisum(c);
            	}else {
            	primefactorsum+=c;}
                n /= c;
            }
            else
                c++;
        }
		
		return digitsu==primefactorsum;
	}

}
