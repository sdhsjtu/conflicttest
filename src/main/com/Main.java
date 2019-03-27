package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> l2 = Arrays.asList(2,3,1,4);
		List<Integer> l = new ArrayList<Integer>();
		l.addAll(l2);
		l.remove(new Integer(1));
		for(int i:l) {
			System.out.println(i);
		}
		
		
	}

}
