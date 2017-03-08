package Activity01;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
                Card a = new Card("Jack", "Hearts", 10);
                Card b = new Card("Queen", "Diamonds", 20);
                Card c = new Card("Jack", "Hearts", 10);
                a.pointValue();
                a.matches(b);
                a.matches(c);
	}
}
