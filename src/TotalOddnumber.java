public class TotalOddnumber {
    public static int sumOddNumbers(int[] seriesOfNumber) {
        int sum = 0;
        for (int number : seriesOfNumber) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        return sum;
    }
}
