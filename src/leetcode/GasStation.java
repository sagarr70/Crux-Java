package leetcode;

public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gas[]= {1,2,3,4,5};
		int cost[]= {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas,cost));
		

	}
	 public static int canCompleteCircuit(int[] gas, int[] cost) {
	        int idx=0;
	        int total=0;
	        int tank=0;
	       for(int i=0;i<gas.length;i++){
	           int current_cost=gas[i]-cost[i];
	           tank+=current_cost;
	           if(tank<0){
	               tank=0;
	               idx=i+1;
	           }
	           total+=current_cost;  
	       }
	        if(total<0){
	            return -1;
	        }
	        else{
	            return idx;
	        }
	    }

}
