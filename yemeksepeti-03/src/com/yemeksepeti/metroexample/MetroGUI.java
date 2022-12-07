package com.yemeksepeti.metroexample;

import javax.swing.*;

public class MetroGUI {

    private static double bakiye;

    public static void main(String[] args) {
        String secim = "0";
        do {

            secim = JOptionPane.showInputDialog(
                    "Bir işlem seçiniz :" +
                            "\n1- Kart bakiyesini görüntüle" +
                            "\n2- Karta para yükle" +
                            "\n3- Metroya bin" +
                            "\n4- Sistemden çıkış");

            switch (secim) {
                case "1":
                    bakiyeGoruntule();
                    break;
                case "2":
                    kartaParaYukle();
                    break;
                case "3":
                    metroyaBin();
                    break;
                case "4":
                    sistemdenCikis();
                    break;
                default:
                    System.out.println("Yanliş seçim. Tekrar seçiniz!");
            }

        } while (!secim.equals("4"));
    }

    private static void sistemdenCikis() {
        System.out.println("Güle güle...");
        System.exit(0);
    }

    private static void metroyaBin() {

        int secim = Integer.valueOf(JOptionPane.showInputDialog("Abonman tipini seçiniz: \n\t1-Tam Bilet\n\t2-Indirimli Bilet"));

        if (secim == 1) {
            if (bakiye >= 7.5) {
                bakiye -= 7.5;
                JOptionPane.showMessageDialog(null, "Tam bilet! Metroya hoşgeldiniz!");
            } else {
                JOptionPane.showMessageDialog(null, "Kart bakiyeniz yeterli değildir!");
                bakiyeGoruntule();
            }
        } else if (secim == 2) {
            if (bakiye >= 3.75) {
                bakiye -= 3.75;
                JOptionPane.showMessageDialog(null, "Indirimli bilet! Metroya hoşgeldiniz!");
            } else {
                JOptionPane.showMessageDialog(null, "Kart bakiyeniz yeterli değildir!");
                bakiyeGoruntule();
            }
        }
    }

    private static void kartaParaYukle() {
        double miktar = Double.valueOf(JOptionPane.showInputDialog("Yüklemek istediğiniz miktarı giriniz:"));
        bakiye += miktar;
        bakiyeGoruntule();
    }

    private static void bakiyeGoruntule() {
        JOptionPane.showMessageDialog(null, "Bakiyeniz : " + bakiye + " TL.");
    }
}
