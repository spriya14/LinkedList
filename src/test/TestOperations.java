package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Operations.linkedlistPractise;

class TestOperations {
	
	linkedlistPractise  obj =new linkedlistPractise();

	@Test
	void testaddFront() {
		
		
		obj.addFront(1);
		obj.addFront(2);
		obj.addFront(3);
		
		Assert.assertEquals(3, obj.getfirst());
		Assert.assertEquals(1, obj.getLast());
		
	}
	
	@Test
	void testaddBack() {
		
		obj.addBack(2);
		obj.addBack(4);
		obj.addBack(6);
		obj.addBack(10);
		
		Assert.assertEquals(10, obj.getLast());
		Assert.assertEquals(2, obj.getfirst());
		
		
	}
	
	@Test
	void testsize() {
		obj.addFront(1);
		
		Assert.assertEquals(1, obj.sizeLinkedList());
		obj.deleteValue(1);
		Assert.assertEquals(0, obj.sizeLinkedList());
		
		obj.addBack(233);
		Assert.assertEquals(1, obj.sizeLinkedList());
		
	}
	
	@Test
	void testDelete() {
		
		
		obj.addBack(1);
		obj.addBack(23);
		obj.addBack(25);
		
		
		Assert.assertEquals(3, obj.sizeLinkedList());
		obj.deleteValue(23);
		Assert.assertEquals(2, obj.sizeLinkedList());
		
		
	}

}
