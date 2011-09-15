/**
 * 
 */
package uk.co.wansdykehouse.fatfish;

import java.util.Locale;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

/**
 * @author rich
 */
public class FatFishTest extends TestCase {

	private FatFish fatFish;
	
	@Before
	public void setUp() {
		fatFish = new FatFish(Locale.UK);
	}
	
//	@Test
//	public void testLoop() throws Exception {
//		for (int i = 0; i<1000; i++) {
//			System.out.println(fatFish.get());
//			Thread.sleep(500);
//		}
//	}
	
	@Test
	public void testFromId() {
		assertEquals("21 sincere pears jump beautifully", fatFish.get(1L));
		assertEquals("9 fashionable foxes saunter competitively", fatFish.get(2L));
		assertEquals("30 unusual birds cook kindly", fatFish.get(3L));
		assertEquals("22 pristine wasps race swiftly", fatFish.get(4L));
		assertEquals("16 fat sheep chant elegantly", fatFish.get(5L));
	}
}
