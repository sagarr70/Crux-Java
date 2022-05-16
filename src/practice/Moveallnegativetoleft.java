package practice;
import java.util.ArrayList;
public class Moveallnegativetoleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//https://www.codingninjas.com/codestudio/problems/move-all-negative-numbers-to-beginning-and-positive-to-end_1112620?leftPanelTab=1
	//https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1#	
	
	    public static ArrayList<Integer> separateNegativeAndPositive(ArrayList<Integer> nums) {
	       int possitive=0;
	        int negative=0;
	        for(int i=0;i<nums.size();i++){
	        	//for moving all negative to right just change nums.get(i)>=0 to nums.get(i)<0
	            if(nums.get(i)>=0){
	                negative++;
	            }
	            else{
	                if(possitive!=negative){
	                    int temp=nums.get(negative);
					    nums.set(negative,nums.get(possitive));
						 nums.set(possitive,temp);
	                 
	                    possitive++;
	                    negative++;
	                }else{
	                    possitive++;
	                    negative++;
	                }
	            }
	        }
			return nums;
	    }
	}


