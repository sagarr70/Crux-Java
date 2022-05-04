package Homework;

import java.util.Scanner;

public class inverseArray {
	public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        arr=inversearray(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        

    }
    public static int[] inversearray(int[] arr,int n){
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[arr[i]]=i;
        }
        return ans;
    }
}
