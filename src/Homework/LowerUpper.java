package Homework;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        char input=sc.next().charAt(0);
        sc.close();
        if(input>=65 && input<=91){
            System.out.print("UPPERCASE");
        }
        else{
            if(input>=97 && input<=123){
                System.out.print("lowercase");
            }
            else{
                System.out.print("Invalid");
            }
        }

	}

}
