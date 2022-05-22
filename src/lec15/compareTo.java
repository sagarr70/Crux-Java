package lec15;

public class compareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String a="sagar";
          String b="sahil";
          System.out.println(compare(a,b));
          
	}

	private static int compare(String a, String b) {
		int i=0;int j=0;
		while(i<a.length() && j<b.length()) {
			if(a.charAt(i)>b.charAt(j)) {
				return a.charAt(i)-b.charAt(j);
			}
			else {
				if(a.charAt(i)<b.charAt(j)) {
					return a.charAt(i)-b.charAt(j);
				}
			}
			i++;j++;
		}
//		if(a.length()==b.length()) {
//			return 0;
//		}
//		else {
//			
//		
//		if(a.length()>b.length()) {
//			return 1;
//		}
//		else {
//			return -1;
//		}}
		return a.length()-b.length();
	}

}
