import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }

        var result = NumberTypeCalculator.getPositiveEvenTotal(arr);
        System.out.println("Total of positive & even: " + result);
    }
}
