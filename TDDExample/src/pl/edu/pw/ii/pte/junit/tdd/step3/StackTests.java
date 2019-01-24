package pl.edu.pw.ii.pte.junit.tdd.step3;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.edu.pw.ii.pte.junit.tdd.step3.result.Stack;

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
		// UNCOMMENT FOR 3RD TDD STEP
		// Stack s = new Stack();
		//
		// s.push(1);
		// s.pop();
		//
		// assertTrue(s.isEmpty());
	}
}
