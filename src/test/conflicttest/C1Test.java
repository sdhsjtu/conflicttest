package conflicttest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.C1;

public class C1Test {

	@Test
	public void test() {
		C1 c1 = new C1();
		int ans = c1.addI(1);
		assertEquals(2, ans);
	}

}
