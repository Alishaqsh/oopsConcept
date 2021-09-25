package com.pepecode.stack;

//model class 
public class NormalStack {
	
	protected int[] data;
	protected int tos;
	protected int size;
	public NormalStack() {
		
	}
	
	public NormalStack(int[] data, int tos, int size) {
		super();
		this.data = data;
		this.tos = tos;
		this.size = size;
	}
	
	public void addElement(int val) {
		 tos++;
		data[tos] = val;
       
    }
	public int[] getData() {
		return data;
	}
	public void setData(int[] data) {
		this.data = data;
	}
	public int getTos() {
		return tos;
	}
	public void setTos(int tos) {
		this.tos = tos;
	}
	public int getSize() {
		return this.tos+1;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public int removeElement() {
		 int rv =data[tos];
         tos--;
       return rv;
	}

	public int getElement() {
		 int top =data[tos];
         return top;
	}
	
	

}
