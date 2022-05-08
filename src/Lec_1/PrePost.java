package Lec_1;

public class PrePost {
	public static void main(String[] args) {
		int x = 67;
		// x++---> x=x+1
    	int y = x++; //post
//		System.out.println(x);
		int z = ++y; //pre
		z=z+1;
		
	}

}
