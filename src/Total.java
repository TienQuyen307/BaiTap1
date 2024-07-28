public class Total {
    public static int sumAllNumbers(int[] seriesOfNumber) {
        int sum = 0;
        for (int number : seriesOfNumber) {
            sum += number;
        }
        return sum;
    }
}