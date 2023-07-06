
public class Hand extends Deck {
    Card [] handCards;

    Hand(){
        handCards = new Card[5];
    }

    public void showCardsInHand(){
        System.out.println("Это ваши карты:");
        for (int i = 0; i < handCards.length; i++ ){
            System.out.printf(" %5d   |",(i + 1) );
        }
        System.out.println();
        for (int i = 0; i < handCards.length; i++ ){
            System.out.printf(" %5s   |",handCards[i]);
        }
    }
}
