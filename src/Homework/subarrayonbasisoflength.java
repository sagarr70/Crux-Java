package Homework;

public class subarrayonbasisoflength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sagar";
		for(int i=1;i<=str.length();i++) {
			for(int j=0;j<=str.length()-i;j++) {
				System.out.println(str.substring(j,j+i));
			}
		}

	}

}
