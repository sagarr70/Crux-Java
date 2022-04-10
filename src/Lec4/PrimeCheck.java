package Lec4;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int check=2;
//        boolean prime=true;
        while(check<n/2) {
        	if(n%check==0) {
  
        		break;
        	}else {
        		check++;
        	}
        }
        if(check==n/2) {
        	System.out.println("Prime");
        }else {
        	System.out.println("not prime");
        }
	}

}
