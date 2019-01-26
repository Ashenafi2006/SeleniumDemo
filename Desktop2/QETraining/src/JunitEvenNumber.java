import static org.junit.Assert.*;

import org.junit.Test;

public class JunitEvenNumber {

	@Test
	public void test() {
		PrintEvenNumber Even = new PrintEvenNumber();
		
		int ashu;
		ashu = Even.PrintEvenNum();
		//System.out.println(ashu);
		//assertEquals(ashu,0,2,4,6,8)
	}

}
