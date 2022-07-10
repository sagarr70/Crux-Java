package Lec16;

public class wrapperclass {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
    	// TODO Auto-generated method stub
		//	Non-primitive(generic) data type for using in ArrayLists
		//for every primitive data has a wrapper class
		//converting primitive data type --> Non-primitive data type
		//Byte = byte
		//Short = short
		//Integer = int
		//Long = long
		//Double = double
		//Float = float
		//Boolean = boolean
		//Character = char
    	
    	//cache for byte,short,long, int value between -128 to 127 will be assigned to same address 
    	
    	Integer a=110;
    	Integer b=110;
    	Integer c=128;
    	Integer d=128;
    	System.out.println(a==b);
    	System.out.println(c==d);
    	//auto-boxing--> storing  primitive to non-primitive
		int li = 17;
		Integer b1 = li; //auto-boxing
		int i1 = a; //On-boxing --> storing  non-primitive to primitive
    	
    	
    	
    	
    }
}
