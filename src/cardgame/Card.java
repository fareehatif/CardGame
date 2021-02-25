package cardgame;

public class Card {

	private int value;
	private String suit;
        
        public static final String [] SUITS =
        {"Hearts", "Diamonds", "Spades", "Clubs"};

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
        
        

	public int getValue() {
		return this.value;
	}

	/**
	 * 
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return this.suit;
	}

	/**
	 * 
	 * @param suit
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}

	public void getAttribute() {
		// TODO - implement Card.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Card.setAttribute
		throw new UnsupportedOperationException();
	}

}