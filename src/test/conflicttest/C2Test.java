package conflicttest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.C2;

public class C2Test {

	@Test
	public void test() {
		C2 c = new C2();
		int ans = c.func(1);
		assertEquals(2, ans);
	}

}
