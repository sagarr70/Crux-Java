 package lec18_Recurssion;

public class fibonacci {
    public static int fibo(int n) {
    	if(n==0) {
    		return 0;
    	}
    	if(n==1) {
    		return 1;
    	}
    	
    	int f1=fibo(n-1);
    	int f2=fibo(n-2);
    	return f1+f2;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println(fibo(n));

	}

}
