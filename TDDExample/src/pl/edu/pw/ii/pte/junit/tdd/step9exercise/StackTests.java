package pl.edu.pw.ii.pte.junit.tdd.step9exercise;

import static org.junit.Assert.*;

import java.nio.BufferOverflowException;
import java.util.EmptyStackException;

import org.junit.Test;

public class StackTests {

	@Test
	public void newlyCreatedStackIsEmpty() {
		Stack s = new Stack();

		assertTrue(s.isEmpty());
	}

	@Test
	public void afterPushStackIsNoLongerEmpty() {
		Stack s = new Stack();

		s.push(1);

		assertFalse(s.isEmpty());
	}

	@Test
	public void afterPushAndPopStackIsEmptyAgain() {
		Stack s = new Stack();

		s.push(1);
		s.pop();

		assertTrue(s.isEmpty());
	}

	@Test(expected = EmptyStackException.class)
	public void emptyStackThrowsOnPop() {
		Stack s = new Stack();

		s.pop();
	}

	@Test
	public void popReturnsWhatWasPushed() {
		Stack s = new Stack();

		s.push(1234);

		assertEquals(1234, s.pop());
	}

	@Test
	public void stackDoesNotBecomeEmptyWhenThereWasLessPopThanPush() {
		Stack s = new Stack();

		s.push(1);
		s.push(2);
		s.pop();

		assertFalse(s.isEmpty());
	}

	@Test
	public void lastPopReturnsFirstPushedValue() {
		Stack s = new Stack();

		s.push(1);
		s.push(2);
		s.pop();

		assertEquals(1, s.pop());
	}

	@Test(expected = BufferOverflowException.class)
	public void stackThrowsWhenTryingToPushMoreThanMaximumCapacity() {
		Stack s = new Stack();

		for (int i = 0; i < Stack.MAXIMUM_CAPACITY + 1; ++i)
			s.push(i);
	}
	
	@Test
	public void sizeOfStackIsEmpty(){
		Stack s = new Stack();
		assertEquals(0,s.getSize());
	}
	
	@Test
	public void sizeOfStackIsFull(){
		Stack s = new Stack();
		for (int i = 0; i < Stack.MAXIMUM_CAPACITY; ++i)
			s.push(i);
		
		assertEquals(s.MAXIMUM_CAPACITY,s.getSize());
	}
	
	@Test
	public void sizeOfStackIsFiveElements(){
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		assertEquals(5,s.getSize());
	}
	
	@Test
	public void sizeOfStackIsMoreThenMaximumCapacity(){
		Stack s = new Stack();

		for (int i = 0; i < Stack.MAXIMUM_CAPACITY; ++i)
			s.push(i);
		int x = s.getSize();
		s.push(x+5);
		int y = s.getSize();
		assertEquals(s.MAXIMUM_CAPACITY,s.getSize());
	}
	
	
	
	// TODO configurable Stack capacity
	// TODO Stack.clear()
	// TODO Stack.getSize()
}