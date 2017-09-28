public class DeckOfCards
{
   //variable declaraion
	private Card[] deck;
	private final int set = 52;
	private int cardsdealt = 0;
	public DeckOfCards()
	{
		deck = new Card[set];
		 int i = 0;
	   	 for (int suit = Card.CLUBS; suit <= Card.SPADES; suit++)           
	   	    for (int rank = 1; rank <= 13; rank++ )
	   		deck[i++] = new Card(rank, suit); 
	}
	//constructor to shuffle the deck 
	public void shuffle()
	{
      //conditional
		if(cardsdealt == deck.length)
			System.out.println("There are no more cards in the deck!");
		else
			for (int i = deck.length-1; i > 0; i--) 
			{
	            int r = (int)(Math.random()*(i+1));
	            Card random = deck[i];
	            deck[i] = deck[r];
	            deck[r] = random;
	       }
	}
   //constructor to deal out the deck
	public Card deal()
	{
		if(cardsdealt == deck.length)
			System.out.println("There are no more cards in the deck!");
		else
			cardsdealt++;
			return deck[cardsdealt-1];
	}
	//report of the remainder 
	public int report()
	{
		return deck.length - cardsdealt;
	}
}
