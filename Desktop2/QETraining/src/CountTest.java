import static org.junit.Assert.*;

import org.junit.Test;


public class CountTest {

	@Test
	public void test() {
		FirstClas Result = new FirstClas();
		int evenNumber = 10; 
		assertEquals(Result.countToTen(),evenNumber);
	}
 
}
