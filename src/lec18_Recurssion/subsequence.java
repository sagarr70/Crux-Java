package lec18_Recurssion;

public class subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		subsi(s,"");

	}

	private static void subsi(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=s.charAt(0);
		subsi(s.substring(1),ans);
		subsi(s.substring(1),ans+ch);				
		
		
	}

}
