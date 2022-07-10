package Homework;

import java.util.Scanner;

public class PlayingwithGoodStrings {

//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		String input=sc.next();
//		int ans=0;
//		
//		for(int i=0;i<input.length();i++) {
//			for(int j=i;j<input.length();j++) {
//				String substr= input.substring(i,j+1);
//				if(isgood(substr)==true) {
//					ans=Integer.max(ans, substr.length());
//				}
//			}
//		}
//		System.out.println(ans);
//		
//
//	}
//
//	private static boolean isgood(String substr) {
//		String vovel="aeiou";
//		for(int i=0;i<substr.length();i++) {
//			if(vovel.indexOf(substr.charAt(i))==-1) {
//				return false;
//			}
//			
//		}
//		return true;
//
//	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String input=sc.next();
		int ans=0;
		
		for(int i=0;i<input.length();) {
			
            if(isvovel(input.charAt(i))){
              int count=0;
              while(i<input.length() && isvovel(input.charAt(i))){
                  i++;count++;
              }
              ans=Integer.max(ans,count);
            }
            else{
               i++;
            }
        

        
            
		}
		System.out.println(ans);
		sc.close();
		

	}

	private static boolean isvovel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
		return false;

	}
	

}
