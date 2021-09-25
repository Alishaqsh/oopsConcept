package com.pepecode.stack;

//abstraction
public interface StackInteface {
	
	void display();
	int size();
	int pop() throws StackException;
	int top() throws StackException;
	void push(int val) throws StackException;
}
