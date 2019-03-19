package conflicttest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import shape.Circle;

public class CircleTest {

	@Test
	public void test() {
		Circle circle = new Circle();
		double ans = circle.getLength(1);
		assertEquals(2*Math.PI, ans);
	}

}
