package practice;
class stack{
	private int max=1000;
	private int dataarray[]=new int[max];
	private int top;
	stack() {
		top=-1;
	}
	boolean push(int data) {
		if(top>=max) {
			System.out.println("overflow");
			return false;
		}else
		{
		dataarray[++top]=data;
		return true;
	    }
	}
	boolean pop() {
		if(top==-1) {
			System.out.println("underflow");
			return false;
		}
		else {
			top--;
			return true;
		}
	}
	int peak(){
		if(top==-1) {
			System.out.println("empty");
			return -1;
		}
		else {
			return dataarray[top];
		}
	}
	
	
	
}


public class stackusingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s=new stack();
		s.push(0);
		s.push(1);
		System.out.println(s.peak());
		s.pop();
		System.out.println(s.peak());
		s.pop();
		System.out.println(s.peak());
		s.pop();

	}

}
