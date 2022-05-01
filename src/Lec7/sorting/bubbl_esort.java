package Lec7.sorting;

public class bubbl_esort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-7,-6,-2,-11,5,0};
		bubblesort(a);

	}

	private static void bubblesort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
			if(a[j]>a[(j+1)%a.length]) {
				int temp=a[j];
				a[j]=a[(j+1)%a.length];
				a[(j+1)%a.length]=temp;
			}}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
