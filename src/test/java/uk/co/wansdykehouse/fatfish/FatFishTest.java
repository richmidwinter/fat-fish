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
		assertEquals("21 quaint people buzz gleefully", fatFish.get(1L));
		assertEquals("9 short cars moan viciously", fatFish.get(2L));
		assertEquals("30 strong sheep work outside", fatFish.get(3L));
		assertEquals("22 wrinkled geese listen ferociously", fatFish.get(4L));
		assertEquals("16 cold apples yawn violently", fatFish.get(5L));
	}
}
