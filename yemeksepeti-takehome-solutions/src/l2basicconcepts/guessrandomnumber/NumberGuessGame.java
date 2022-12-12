package l2basicconcepts.guessrandomnumber;

import javax.swing.*;
import java.util.Random;

public class NumberGuessGame {
    static int turns = 3;

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(10 - 0 + 1) + 0;
        System.out.println(randomNumber);


        do {
            if (turns != 0) {
                String guess = JOptionPane.showInputDialog(null, "Sayı tahmininizi giriniz : ");
                if (Integer.valueOf(guess) > randomNumber) {
                    JOptionPane.showMessageDialog(null, "Girdiğiniz rakam büyük");
                } else if (Integer.valueOf(guess) < randomNumber) {
                    JOptionPane.showMessageDialog(null, "Girdiğiniz rakam küçük");
                } else {
                    JOptionPane.showMessageDialog(null, "Sayıyı bildiniz.. AFERİN !!!!");
                }
                turns--;
                JOptionPane.showMessageDialog(null, "Kalan hak : " + turns);
            } else {
                JOptionPane.showMessageDialog(null, "Hakkınız bitti! Tahmin etmeniz gereken rakam : " + randomNumber + " idi...");
            }
        } while (turns != 0);

    }


}
