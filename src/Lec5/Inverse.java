//Take the following as input.
//A number
//Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number.
//
//Write a function that returns its inverse, where inverse is defined as follows
//
//Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
//
//




package Lec5;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int rev=0;
        int count=1;
        while(n>0){
            int digit=n%10;
           
            int mul=count;
            while(digit>1)
            {
                mul=mul*10;
                digit--;
            }
            
            rev=rev+mul;
            n=n/10;
            count++;
        }
        System.out.print(rev);
	}

}
