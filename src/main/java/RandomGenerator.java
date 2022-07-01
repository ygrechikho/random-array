import java.util.Random;

public class RandomGenerator {
    public int[] GetRndNumber(int min, int max, int total) {
        Random rd = new Random();
        int[] arr = new int[total];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(min, max);
        }

        return arr;
    }

    public int[] GetRndNumber(int total) {
        Random rd = new Random();
        int[] arr = new int[total];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }

        return arr;
    }
}
