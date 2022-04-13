package Homework;

import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int sum_odd=0;
		int sum_even=0;
		int count=0;
		while(n!=0) {
			if(count==0) {
				sum_odd+=n%10;
			}
			else {
				sum_even+=n%10;
			}
			count=1-count;
			n=n/10;
		}
		System.out.println(sum_odd);
		System.out.println(sum_even);

	}

}
