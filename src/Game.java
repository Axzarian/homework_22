import java.util.Scanner;

public class Game {
    private static final Scanner scanner = new Scanner(System.in);

    public void playGame(){

        Deck deckFirst = new Deck();
        deckFirst.deckShuffle();

        Hand player = new Hand();
        System.out.println("\n\n");

        playerGetFiveCards(player, deckFirst);
        System.out.println();

        cardWhichWillBeChanged(deckFirst,player);

        player.showCardsInHand();

    }
    private static void cardWhichWillBeChanged(Deck deck, Hand hand ){
        while (true){
            try {
                System.out.print("Введите номера карт которые хотите поменять через пробел ( например: 2 3 5): ");

                String line = scanner.nextLine();

                String[] numbers = line.split("\\s");

                int cardsNums [] = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++){
                    cardsNums[i] = Integer.valueOf(numbers[i]);
                }

                int cardNumber;

                for (int i = 0; i < cardsNums.length; i++ ){
                    cardNumber = cardsNums[i];
                    hand.handCards[cardNumber - 1] = deck.takeCard();
                }
                break;
            }
            catch (Exception e){
                System.out.println("\nЧто-то пошло не так!!! Введите номера карт еще раз и убедитесь что:" +
                        "\n1. Вводите номера карт через пробел" +
                        "\n2. Номер карты не больше цифры 5" +
                        "\n3. Не введи букв");
            }
        }
    }

    private static void playerGetFiveCards(Hand hand, Deck deck){
        for (int i = 0; i < hand.handCards.length; i++){
            hand.handCards[i] = deck.takeCard();
        }
        hand.showCardsInHand();
    }
}
