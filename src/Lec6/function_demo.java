package Lec6;

public class function_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JVM -> Java virtual machine 
        //memory ->stack,heap
		// stack -> byte,short,int,long,double,float
		
		System.out.println("hey");
		addition();
		int ans=substract(10,7);
		System.out.println(ans);
		System.out.println("bye");
		
	}
	public static void addition() {
		int a=9;
		int b=7;
		int c=a+b;
		
		System.out.println(c);
		substract(1,2);//overflow more than 10^4 calls 
	}
	public static int substract(int a,int b) {
		int ans=a-b;
		addition();
		return ans;
		
	}

}
