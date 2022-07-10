package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumofTwoArray {

	public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr1[]=new int[n];
      for(int i=0;i<n;i++){
          arr1[i]=sc.nextInt();
      }
      int m=sc.nextInt();
      int arr2[]=new int[m];
       for(int i=0;i<m;i++){
          arr2[i]=sc.nextInt();
      }
      int idx1=arr1.length-1;
      int idx2=arr2.length-1;
      ArrayList<Integer> ans=new ArrayList<>();
      int carry =0;
      while(true){
            int sum=arr1[idx1]+arr2[idx2]+carry;
            ans.add((sum)%10);
            carry=sum/10;
            idx1--;
            idx2--;
            if(idx1<0 || idx2<0){
                break;
            }
      }
      while(idx1>=0){
          int sum=arr1[idx1]+carry;
          ans.add(sum%10);
          carry=sum/10;
          idx1--;
      }
      while(idx2>=0){
          int sum=arr2[idx2]+carry;
          ans.add(sum%10);
          carry=sum/10;
          idx2--;
      }
      if(carry>0) {
    	  ans.add(carry);
      }
      Collections.reverse(ans);
      for(int v: ans){
          System.out.print(v+", ");
      }
      System.out.print("END");
      sc.close();
    }
}
