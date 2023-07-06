import java.util.Random;

public class Deck {
    Random random = new Random();
    Card[] cardsArray = CardGenerator.getDeck();


    public void deckShuffle(){
        int randomIndexToSwap;
        Card temporary;
        for (int i = 0; i < cardsArray.length; i++){
            randomIndexToSwap = random.nextInt(cardsArray.length);
            temporary = cardsArray[randomIndexToSwap];
            cardsArray[randomIndexToSwap] = cardsArray[i];
            cardsArray[i] = temporary;
        }
    }

    public Card takeCard(){
        int choose = random.nextInt(cardsArray.length);
        Card temp = cardsArray[choose];
        cardsArray[choose] = cardsArray[0];
        cardsArray[0] = temp;

        Card [] result = new Card[cardsArray.length - 1];
        System.arraycopy(cardsArray,1,result,0,cardsArray.length - 1);
        cardsArray = result;
        return temp;
    }
}
