package lec18_Recurssion;

public class firstocc {
    public static int find(int arr[],int item,int i) {
    	if(i==arr.length) {
    		return -1;
    	}
    	
    	if(arr[i]==item) {
    		return i;
    	}
    	
		return find(arr,item,i+1);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5};
		int item=1;
		System.out.println(find(arr,item,0));

	}

}
