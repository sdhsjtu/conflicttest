package conflicttest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.C1;

public class C1Test {

	@Test
	public void test() {
		C1 c1 = new C1();
		double ans = c1.getAllLength(1);
		assertEquals(2*Math.PI, ans);
	}

}
