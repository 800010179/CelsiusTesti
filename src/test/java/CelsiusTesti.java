import static org.junit.Assert.*;

import org.junit.Test;

public class CelsiusTesti {

	@Test
	public void testCelsiusConvertion() {
		
		assertEquals(0, CelsiusConverter.convertFtoC(32));
	}

}
