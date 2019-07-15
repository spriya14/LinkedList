package Operations;

public class linkedlistPractise {
	
	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data  = data;
		}
	}
	
	private Node head;
	
	//AddFront
	
	public void addFront(int data) {
		Node newNode = new Node(data);
		
		if (head == null) {
			
			head = newNode;
		}
		
		else {
			
			newNode.next = head;
			head = newNode;
		}
		
		
	}

	public int getfirst() {
		return head.data;
	}

	public int getLast() {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		return current.data;
	}
	
	//AddBack
	
	public void addBack(int data) {
		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
		}
		Node current = head;
		while (current.next!= null) {
			current = current.next;
			}
		current.next= newNode;
		newNode.next = null;
		
	}
	
	public int sizeLinkedList() {
		int flag = 1;
		Node current =head ;
		while (current.next != null) {
			flag += 1;
			current = current.next;
			
			
		
		}
		return flag;
	}
	
	//Delete Node with a given value
	public void deleteValue(int data) {
		
		
		if(head == null) {
			return;
		}
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		//in the middle;
		Node current = head;
		while(current.next!= null) {
		if (current.next.data== data) {
			current.next = current.next.next;
			return;
			
		}else {
		
			current = current.next;
		}
		
		}
	}

}
