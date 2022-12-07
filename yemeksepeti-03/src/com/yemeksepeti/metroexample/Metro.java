package com.yemeksepeti.metroexample;

import java.util.Scanner;

public class Metro {

    private static double bakiye;
    private static Scanner scanner = new Scanner(System.in); // class variable& class field

    public static void main(String[] args) {
        int secim = 0;

        do {
            System.out.println("Bir işlem seçiniz :");
            System.out.println("1- Kart bakiyesini görüntüle");
            System.out.println("2- Karta para yükle");
            System.out.println("3- Metroya bin");
            System.out.println("4- Sistemden çıkış");

            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    bakiyeGoruntule();
                    break;
                case 2:
                    kartaParaYukle();
                    break;
                case 3:
                    metroyaBin();
                    break;
                case 4:
                    sistemdenCikis();
                    break;
                default:
                    System.out.println("Yanliş seçim. Tekrar seçiniz!");
            }

        } while (secim != 4);
    }

    private static void sistemdenCikis() {
        System.out.println("Güle güle...");
        System.exit(0);
    }

    private static void metroyaBin() {

        System.out.println("Abonman tipini seçiniz: \n\t1-Tam Bilet\n\t2-Indirimli Bilet");
        int secim = scanner.nextInt();

        if (secim == 1) {
            if (bakiye >= 7.5) {
                bakiye -= 7.5;
                System.out.println("Tam bilet! Metroya hoşgeldiniz!");
            } else {
                System.out.println("Kart bakiyeniz yeterli değildir!");
                bakiyeGoruntule();
            }
        } else if (secim == 2) {
            if (bakiye >= 3.75) {
                bakiye -= 3.75;
                System.out.println("Indirimli bilet! Metroya hoşgeldiniz!");
            } else {
                System.out.println("Kart bakiyeniz yeterli değildir!");
                bakiyeGoruntule();
            }
        }
    }

    private static void kartaParaYukle() {
        System.out.println("Yüklemek istediğiniz miktarı giriniz:");
        double miktar = scanner.nextDouble();
        bakiye += miktar;
        bakiyeGoruntule();
    }

    private static void bakiyeGoruntule() {
        System.out.println("Bakiyeniz : " + bakiye + " TL.");
    }
}
