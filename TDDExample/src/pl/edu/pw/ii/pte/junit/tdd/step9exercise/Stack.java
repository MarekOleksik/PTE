package pl.edu.pw.ii.pte.junit.tdd.step9exercise;

import java.nio.BufferOverflowException;
import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

	public static final int MAXIMUM_CAPACITY = 10;
	private int size = 0;
	private int[] contents = new int[MAXIMUM_CAPACITY];

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(int i) {
		if (size == MAXIMUM_CAPACITY) {
			throw new BufferOverflowException();
		}
		contents[size++] = i;
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return contents[--size];
	}

	public int getSize() {
		return size;
	}

	public int[] getContents() {
		return contents;
	}

	public boolean isFull() {
		return size == MAXIMUM_CAPACITY;
	}

	public int peek() {
	    if (size == -1)
	        throw new EmptyStackException();
		return contents[size];
	}

	public void extendStack()	{
	    int [] copy = Arrays.copyOf(contents, contents.length+1); 
	     }
	/*
	private boolean compareStacks(Stack a, Stack b) {
		  if (a.isEmpty() != b.isEmpty()) return false; // check if one is empty
		  if (a.isEmpty() && b.isEmpty()) return true; // check if both are empty
		  int element_a = a.pop(); // grab elements and compare them
		  int element_b = b.pop();
		  if (((element_a==null) && (element_b!=null)) || !element_a.equals(element_b)) {
		    a.push(element_a); // if they are not equal, restore them and return false
		    b.push(element_b);
		    return false;
		  }
		  boolean result = compareStacks(a, b); // compare shortened stacks recursively
		  a.push(element_a); // restore elements
		  b.push(element_b);
		  return result; // return result from recursive call
		}
		*/
}
