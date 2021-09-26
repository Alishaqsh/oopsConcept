package com.pepecode.stack;

public class CustomStack implements StackInteface {

	NormalStack st = null;
	
	public CustomStack() {
		st = new NormalStack(new int[16], -1, 0);
	}
	public CustomStack(int cap) {
		st = new NormalStack(new int[cap], -1, 0);
	}

	@Override
	public void display() {
		int[] data = st.getData();
		for (int i = st.getTos(); i >= 0; i--) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

	}

	@Override
	public void push(int val) throws StackException {
		if (st.getTos() == st.getData().length-1) {
			 throw new StackException("Stack overflow");
		}
		st.addElement(val);
	}

	@Override
	public int size() {
		return st.getSize();
	}

	@Override
	public int pop() throws StackException {
		if (st.getTos() == -1) {
			 throw new StackException("Stack underflow");
		}
		int removedValue = st.removeElement();
		return removedValue;
	}

	@Override
	public int top() throws StackException {
		if (st.getTos() == -1) {
			 throw new StackException("Stack underflow");
		}

		int topElement = st.getElement();
		return topElement;
	}

}
