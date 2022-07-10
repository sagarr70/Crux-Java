package lec18_Recurssion;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact(n,1));

	}

	private static int fact(int n,int ans) {
		// TODO Auto-generated method stub
		//base condition
		if(n==0) {
			return ans;
		}
		
		
		return fact(n-1,ans*n);
	}

}
