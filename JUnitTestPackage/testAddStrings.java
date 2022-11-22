package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		String result = junit.AddStrings("Tanzeel", "Ahmad");
		assertEquals("TanzeelAhmad",result);
	}

}
