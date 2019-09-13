public class CardGameRunner
{
    public static void main(String[] args)
    {
        Card c = new Card();
        System.out.println(c);
        CardStack cs = CardStack.makeDeck(CardStack.ACE_HIGH);
        System.out.println(cs);
    }

}
