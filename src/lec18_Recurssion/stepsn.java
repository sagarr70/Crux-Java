package lec18_Recurssion;

public class stepsn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		printpath(0,n,"");

	}

	private static void printpath(int curr, int n, String ans) {
		if(curr==n) {
			System.out.println(ans);
			return;
		}
		if(curr>n) {
			return;
		}
		printpath(curr+1,n,ans+"1");
		printpath(curr+2,n,ans+"2");
		printpath(curr+3,n,ans+"3");
		
	}

}
