package Homework;

public class Diagonal_Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=   {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16},
						{17,18,19,20}};
		
		int m=arr.length;
		int n=arr[0].length;
		int ans[]=new int[m*n];
		int idx=0;
		for(int d=0;d<m+n-1;d++) {
			int r=0;
			int c=0;
			if(d%2!=0) {
		    if(d<n) {
		    	r=0;
		    	c=d;
		    	while(r<m && c>=0) {
		    		ans[idx]=arr[r][c];
		    		idx++;
		    		r++;
		    		c--;
		    	}
		    }
		    else {
		    	r=d-n+1;
		    	c=n-1;
		    	while(r<m && c>=0) {
		    		ans[idx]=arr[r][c];
		    		idx++;
		    		r++;
		    		c--;
		    	}
		    }
		    }
			else {
				if(d<m) {
			    	r=d;
			    	c=0;
			    	while(r>=0 && c<n) {
			    		ans[idx]=arr[r][c];
			    		idx++;
			    		r--;
			    		c++;
			    	}
			    }
			    else {
			    	r=m-1;
			    	c=d-m+1;
			    	while(r>=0 && c<n) {
			    		ans[idx]=arr[r][c];
			    		idx++;
			    		r--;
			    		c++;
			    	}
			    }
			}
		}

	}

}
