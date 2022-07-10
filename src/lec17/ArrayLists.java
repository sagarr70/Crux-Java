package lec17;

import java.util.ArrayList;
public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<>();
		//initial capacity of ArrayList is 10
		System.out.println(list);
		System.out.println(list.size());
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println(list);
		//add at any index range 0 to size
		list.add(0,5); 
		//remove
		System.out.println(list.remove(2)); //list.remove(index)
		System.out.println(list);
		//get
		System.out.println(list.get(2));
		list.set(2, 21);
		//print using loop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//for each loop
		for(var v:list) {
			System.out.println(v);
		}
		
		

	}

}
