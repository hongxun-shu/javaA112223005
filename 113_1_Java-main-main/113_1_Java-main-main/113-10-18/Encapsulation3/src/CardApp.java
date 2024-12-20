import java.util.Scanner;

public class CardApp {
    public static void main(String[] args) {
        Cashcard[] cards = {
                new Cashcard("A001", 500, 0),
                new Cashcard("A002", 300, 0),
                new Cashcard("A003", 1000, 1),
                new Cashcard("A004", 2000, 2),
                new Cashcard("A005", 3000, 3)
        };

        Scanner input = new Scanner(System.in);

        for(var card : cards) {
            System.out.printf("為(%s, %d, %d)儲值",
                    card.getNumber(), card.getBalance(), card.getBonus());
            card.store(input.nextInt());
            System.out.printf("明細(%s, %d, %d)%n",
                    card.getNumber(), card.getBalance(), card.getBonus());
        }
    }
}