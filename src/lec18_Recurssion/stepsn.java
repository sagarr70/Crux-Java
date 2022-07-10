package lec18_Recurssion;

public class stepsn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println(printpath(0,n,""));

	}

	private static int printpath(int curr, int n, String ans) {
		if(curr==n) {
			System.out.println(ans);
			return 1;
		}
		if(curr>n) {
			return 0;
		}
		int l=printpath(curr+1,n,ans+"1");
		int r=printpath(curr+2,n,ans+"2");
		int q=printpath(curr+3,n,ans+"3");
		return l+r+q;
		
	}

}
