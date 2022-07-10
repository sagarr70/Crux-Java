package lec18_Recurssion;

public class RecursionAsciiSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		int output=subsi(s,"");
		System.out.println();
		System.out.println(output);
	}

	private static int subsi(String s, String ans) {
		if(s.length()==0) {
			System.out.print(ans+" ");
			return 1;
		}
		char ch=s.charAt(0);
		int asci=(int)ch;
		int l=subsi(s.substring(1),ans);
		int p=subsi(s.substring(1),ans+ch);
		int q=subsi(s.substring(1),ans+asci);
		
		
		
		return l+p+q;
	}

}
