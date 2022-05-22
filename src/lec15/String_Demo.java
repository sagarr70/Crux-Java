package lec15;

public class String_Demo {
    //string are immutable in Java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";  //str1 and str2 will have same address
		String str3= new String("hello"); 
		String str4=new String("hello"); //(str,str1),str3,str4 have different address
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str3);
		System.out.println(str4);
		int a=9;
		int b=10;
		System.out.println(a==b); //compares value
        System.out.println(str==str1); // compares address in String
        System.out.println(str==str3);
        str+="sagar"; //create new string outside heap string pool
        System.out.println(str==str1);
        System.out.println(str.equals(str4));//compares value of strings
        System.out.println(str.charAt(5));
        System.out.println(str.length());
        System.out.println(str.compareTo(str4)); // >0(str is greater),<0(str4 is greater),0 equal strings
        
	}

}
