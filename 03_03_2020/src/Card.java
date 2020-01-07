
public enum Card {
	SPADES("spades card",1),
	CLUBS("clubs card",2),
	HEARTS("hearts card",3),
	DIAMONDS("diamonds card",4);
	
	private final String name;
	private final int rank;

	private Card(String n, int r) {

		rank = r;
		name = n;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
}

	
