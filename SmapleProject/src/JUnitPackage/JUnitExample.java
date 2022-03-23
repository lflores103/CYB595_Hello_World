package JUnitPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class JUnitExample {
	@Test
	public void test() {
		System.out.println("Hello World I Work");
        String str1="This is not the testcase in this class";
        assertEquals("This is not the testcase in this class", str1);
    }
}
