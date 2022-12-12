package l2basicconcepts.minmaxchallenge;

public class MinMaxTest {
    public static void main(String[] args) {

        int[] arr = {1, 22, -3, -56, 12, 32, 1000, -199};

        findMax(arr);
        findMin(arr);

    }

    private static void findMax(int[] arr) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(temp < arr[i]){
                temp = arr[i];
            }
        }

        System.out.println("Max value : " + temp);
    }

    private static void findMin(int[] arr) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(temp > arr[i]){
                temp = arr[i];
            }
        }

        System.out.println("Min value : " + temp);
    }
}
