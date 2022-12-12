package l3classesobjects.creditcardchallenge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    // instance variables
    private String cardHolderName;
    private long cardNumber;
    private int cardPan;
    private int cardExpireDate;

    // constructors
    public CreditCard(String cardHolderName, long cardNumber, int cardPan, int cardExpireDate) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cardPan = cardPan;
        this.cardExpireDate = cardExpireDate;
    }

    public CreditCard(String cardHolderName) {
        this.setCardHolderName(cardHolderName);
    }

    public CreditCard() {
    }

    // getter & setter

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        String[] charsWithoutSpace = cardHolderName.split(" ");
        boolean isNotLetter = false;
        List<Character> wrongInputs = new ArrayList<>();

        for (String s : charsWithoutSpace) {
            for (char c : s.toCharArray()) {
                if (!Character.isLetter(c)) {
                    isNotLetter = true;
                    wrongInputs.add(c);
                }
            }
        }

        if (!isNotLetter) {
            this.cardHolderName = cardHolderName;
        } else {
            System.out.println("The card holder name cannot includes except letters! wrong input : " + wrongInputs.toString());
        }
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        if (String.valueOf(cardNumber).length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("The card number lenght must be 16 digits!");
        }
    }

    public int getCardPan() {
        return cardPan;
    }

    public void setCardPan(int cardPan) {
        if (String.valueOf(cardPan).length() == 3) {
            this.cardPan = cardPan;
        } else {
            System.out.println("The card pan lenght must be 3 digits!");
        }
    }

    public int getCardExpireDate() {
        return cardExpireDate;
    }

    public void setCardExpireDate(int cardExpireDate) {
        if (LocalDate.now().getYear() <= cardExpireDate) {
            this.cardExpireDate = cardExpireDate;
        } else {
            System.out.println("The card expire date must be greater than current date!");
        }
    }
}

