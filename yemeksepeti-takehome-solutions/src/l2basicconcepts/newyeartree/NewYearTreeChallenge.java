package l2basicconcepts.newyeartree;

public class NewYearTreeChallenge {
    public static void main(String[] args) {
        /*
                    1
                   222
                  33333
                 4444444
                555555555
         */
        int k = 4;
        int a = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = k; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < a; j++) {
                System.out.print(i + 1);
            }
            for (int j = k; j > 0; j--) {
                System.out.print(" ");
            }
            k--;
            a += 2;
            System.out.println("");
        }
    }
}
