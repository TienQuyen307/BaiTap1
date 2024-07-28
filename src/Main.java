import javax.xml.transform.Result;

public class Main {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber(1, 99);
        printNumber.printNumber();
        int [] seriesOfNumber = printNumber.getNumber();

        int oddSum = TotalOddnumber.sumOddNumbers(seriesOfNumber);
        System.out.println("Tổng các số lẻ từ 1 tới 99: " + oddSum);

        int totalSum = Total.sumAllNumbers(seriesOfNumber);
        System.out.println("Tổng từ 1 tới 99: " + totalSum);

        double result = Division.divisionOfSeven(totalSum);
        System.out.printf("Kết quả chia tổng cho 7: %.2f%n", result);
    }

}