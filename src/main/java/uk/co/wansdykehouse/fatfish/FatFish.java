/**
 * 
 */
package uk.co.wansdykehouse.fatfish;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author rich
 */
public class FatFish {
	
	private static final String SEPARATOR_CHAR = ",";
	
	private String[] adjectives, nouns, verbs, adverbs;
	
	public FatFish() {
		init(Locale.getDefault());
	}

	public FatFish(final Locale locale) {
		init(locale);
	}
	
	public String get() {
		return get((long) (Math.random() * Long.MAX_VALUE));
	}
	
	public String get(final long id) {
		final StringBuilder message = new StringBuilder();
		
		final int salt = (int) ((Math.pow(id+1000, 2) % Integer.MAX_VALUE));
		
		message.append((salt % 31) + 2);
		message.append(' ');
		message.append(adjectives[(int) (salt % adjectives.length)]);
		message.append(' ');
		message.append(nouns[(int) (salt % nouns.length)]);
		message.append(' ');
		message.append(verbs[(int) (salt % verbs.length)]);
		message.append(' ');
		message.append(adverbs[(int) (salt % adverbs.length)]);
		
		return message.toString();
	}
	
	private void init(final Locale locale) {
		final ResourceBundle dictionary = ResourceBundle.getBundle("dictionary", locale);

		adjectives = dictionary.getString("adjectives").split(SEPARATOR_CHAR);
		nouns = dictionary.getString("nouns").split(SEPARATOR_CHAR);
		verbs = dictionary.getString("verbs").split(SEPARATOR_CHAR);
		adverbs = dictionary.getString("adverbs").split(SEPARATOR_CHAR);

//		System.out.println("Adjectives: " +adjectives.length);
//		System.out.println("Nouns: " +nouns.length);
//		System.out.println("Verbs: " +verbs.length);
//		System.out.println("Adverbs: " +adverbs.length);
	}
}
