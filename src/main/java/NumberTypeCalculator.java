public class NumberTypeCalculator {
    public static int getPositiveEvenTotal(int[] arr) {
        var result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 != 0) {
                result++;
            }
        }
        return result;
    }
}
