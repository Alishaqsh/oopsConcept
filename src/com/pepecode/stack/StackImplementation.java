package com.pepecode.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackImplementation {
	
	public static void main(String[] args) {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n;
			try {
			n = Integer.parseInt(br.readLine());
			//Run time  polymorphism 
		  //  StackInteface st = new CustomStack(n);

		   // executeStack(br, st);
		    
		  //Run time  polymorphism 
		    StackInteface st2 = new DynamicStack(n);

		    executeStack(br, st2);
		    
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		  }
	
	//complitime polymorphism
	private static void executeStack(BufferedReader br, StackInteface st) throws IOException {
		String str = br.readLine();
		while (str.equals("quit") == false) {
			if (str.startsWith("push")) {
				int val = Integer.parseInt(str.split(" ")[1]);
				try {
					st.push(val);
				} catch (StackException e) {
					System.out.println(e.getMessage());
				}
			} else if (str.startsWith("pop")) {
				int val;
				try {
					val = st.pop();
					if (val != -1) {
						System.out.println(val);
					}
				} catch (StackException e) {
					System.out.println(e.getMessage());
				}

			} else if (str.startsWith("top")) {
				int val;
				try {
					val = st.top();
					if (val != -1) {
						System.out.println(val);
					}
				} catch (StackException e) {
					System.out.println(e.getMessage());
				}
				
			} else if (str.startsWith("size")) {
				System.out.println(st.size());
			} else if (str.startsWith("display")) {
				st.display();
			}
			str = br.readLine();
		}
	}
	
	//complitime polymorphism
	private static void executeStack(StackInteface st) throws IOException, StackException {
		st.push(10);
		st.push(20);
		st.push(5);
		st.push(8);
		st.push(2);
		st.push(4);
		st.push(11);
		
		st.display();
		int val = st.pop();
		
		if (val != -1) {
			System.out.println(val);
		}
		val = st.top();
		if (val != -1) {
			System.out.println(val);
		}
		System.out.println(st.size());
	
	}
	

}
