package Lec5;

import java.util.Scanner;

public class Farenheight2Celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int max=sc.nextInt();
        int steps=sc.nextInt();
        sc.close();
        for(int temp=low;temp<=max;temp+=steps){
            int cel=(5*(temp - 32))/(9) ;
            System.out.println(temp+"\t"+cel);
        }

	}

}
