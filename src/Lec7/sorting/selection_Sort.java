package Lec7.sorting;

public class selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,-3,9,6,-9,-11};
		selectionsort(a);

	}

	private static void selectionsort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int idx=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[idx]) {
					idx=j;
				}
				if(idx!=i) {
					int temp=a[i];
					a[i]=a[idx];
					a[idx]=temp;
				}
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
