package practice;

class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class Linkedlistimplementation {
    static node insertatbegin(int data,node head) {
    	node newnode=new node(data);
    	newnode.next=head;
    	head=newnode;
		return head;
    	
    }
    static node insertatend(int data,node head) {
    	node newnode=new node(data);
    	if(head==null) {
    		head=newnode;
    		return head;
    			
    	}
    	else {
    		node temp=head;
    		while(temp.next!=null) {
    			temp=temp.next;
    		}
    		temp.next=newnode;
    		head=temp;
    		return head;
    	}
    }
    static int calcsize(node head) {
    	if(head==null) {
    		return 0;
    	}
    	int size=1;
    	node temp=head;
    	while(temp.next!=null) {
    		temp=temp.next;
    		size++;
    	}
    	return size;
    }
    static node insertatpos(int pos,node head,int data) {
    	int size=calcsize(head);
    	if(pos<1 || pos>size) {
    		System.out.println("Can't insert," + pos + " is not a valid position\n");
    		return head;
    	}
    	else {
    		node newnode=new node(data);
    		node temp=head;
    		if(pos==1) {
    			newnode.next=head;
    			head=newnode;
    			return head;
    		}
    		else {
    			pos=pos-1;
    		while(--pos>0) {
    			temp=temp.next;
    		}
    		newnode.next=temp.next;
    		temp.next=newnode;
    		return head;}
    	}
    	
    }
    static void display(node head) {
    	node temp=head;
    	while(temp.next!=null) {
    		System.out.print(temp.data+"->");
    		temp=temp.next;
    	}
    	System.out.print(temp.data+"->"+"null");
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node head = null;
        head = insertatbegin(15,head);
        head = insertatbegin(10,head);
        head = insertatbegin(6,head);
        head=insertatpos(1,head,8);
        display(head);
        head=insertatpos(4,head,18);
        display(head);
        head=insertatpos(2,head,118);
        display(head);
        head=insertatpos(9,head,1198);
        display(head);


	}

}
