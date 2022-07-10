package lec18_Recurssion;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        ser(n);
        serulta(n);
	}

	private static void ser(int n) {
		if(n==0) {
            return;
		}
		
		System.out.println(n);
		ser(n-1);}
	private static void serulta(int n) {
		if(n==0) {
            return;
		}
		
		System.out.println(n);
		serulta(n-1);
		System.out.println(n);	
	}
		
	

}
