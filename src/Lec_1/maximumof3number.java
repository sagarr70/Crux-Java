package Lec_1;

public class maximumof3number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=189;
        int b=134;
        int c=95;
        if(a>b && a>c) {
        	System.out.println(a);
        }
        else {
        	if(b>a && b>c) {
        		System.out.println(b);
        	}
        	else {
        		System.out.println(c);
        	}
        }
	}

}
