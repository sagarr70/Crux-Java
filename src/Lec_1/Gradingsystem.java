package Lec_1;

public class Gradingsystem {
public static void main(String[] args) {
	int marks=67;
	if(marks>=75) {
		System.out.println("A");
	}
	else {
		if(marks<75 && marks>=60) {
			System.out.println("B");
		}
		else {
			if(marks<60 && marks>= 50) {
				System.out.println("C");
			}
			else {
				if(marks>50 && marks>= 40) {
					System.out.println("D");
				}
				else {
					if(marks>40 && marks>= 30) {
						System.out.println("PASS");
					}
					else {
						System.out.println("FAIL");
					}
				}
				
			}
		}
	}
}
}
