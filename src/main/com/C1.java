package com;

import shape.Circle;
import shape.Shape;
import shape.Square;

public class C1 {
	private Shape s = new Square(1);
	
	public int addI(int j) {
		System.out.println("function addI");
		return j+2;
	}
	
	public int getAllLength(int j) {
		return 0;
	}
}
