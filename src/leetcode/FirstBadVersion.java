package leetcode;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		System.out.println(firstBadVersion(n));

	}
	public static int firstBadVersion(int n) {
        int start=1;
        int end=n;
        
        while(start<=end){
            int mid= start+(end-start)/2;
            if(isBadVersion(mid)){
                if(mid-1>0){
                if(isBadVersion(mid-1)==false){
                    return mid;
                }
                else {
                    end=mid-1;
                }}
                else{
                    return mid;
                }
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
	private static boolean isBadVersion(int mid) {
		return mid>=4;
	}
}
