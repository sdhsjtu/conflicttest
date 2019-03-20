package conflicttest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.C1;

public class C1Test {

	@Test
	public void testEqual() {
		C1 c1 = new C1();
		Integer i = 1;
		Integer j = new Integer(1);
		boolean ans = c1.equal(i,j);
		assertEquals(true, ans);
	}

}
