package Operations;

public class queue {
	
	private class Node{
		int data;
		Node next;
		
		private Node(int data) {
			this.data = data;
		}
		
		private Node head;
		private Node tail;
		
		//Adding element to a Queue
		
		public void add(int data) {
			Node new_node = new Node(data);
			
			if (tail.next == null) {
				tail.next = new_node;
				new_node.next = null;
				
			}
			tail = new_node;
			
			if (head== null) {
				head = tail;
			}
			
			
		}
		
		//Removing data from the queue
		
		public int remove() {
			
			int data = head.data;
			head = head.next;
			return data;
			
			
		}
	}

}
