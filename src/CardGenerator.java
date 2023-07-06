
public class CardGenerator {
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    static String[] suits = {"\u2660","\u2665","\u2666","\u2663"};
    static String[] deck = new String[52];

    public  static Card[] getDeck(){
        Card[] cards = new Card[52];
        int index = 0;
        for (int i = 0; i < ranks.length; i++){
            for (int j = 0; j < suits.length; j++){
                Card card = new Card(ranks[i],suits[j]);
                cards[index] = card;
                index++;
            }
        }
        return cards;
    }
}
