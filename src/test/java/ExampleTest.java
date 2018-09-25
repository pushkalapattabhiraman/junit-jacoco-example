import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ExampleTest {

	@Test
	public void verifySomeRandomMethod() {
		Example junitTest = new Example();
		junitTest.someRandomMethod(11, 12);
	}
	
	@Test
	public void verifySomeRandomMethod2() {
		boolean a = false;
		assertTrue(a);
	}
}
