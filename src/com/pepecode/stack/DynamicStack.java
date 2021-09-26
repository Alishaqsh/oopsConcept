package com.pepecode.stack;

public class DynamicStack extends CustomStack{

	
	public DynamicStack() {
		super();
	}
	public DynamicStack(int cap) {
		super(cap);
	}


	@Override
	public void push(int val) throws StackException {
		int[] data = st.getData();
		int tos =st.getTos();
		if (st.getTos() == data.length-1) {
			int[] temp = new int[2 * data.length];
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			tos++;
			st.setTos(tos);
			temp[tos] = val;
			st.setData(temp);
		} else {
			st.addElement(val);
		}
	}

	

}
