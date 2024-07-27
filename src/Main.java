

public class Main {
    public static void main(String[] args) {
        FrintNumber frintNumber = new FrintNumber();
        int resultFrint = frintNumber.frintNumber();
        System.out.println(resultFrint+ "");

        Total total = new Total();
        int resultSum = total.sum();
        System.out.println("tong cac chu so la = " + resultSum);

        TotalOddnumber totalOddnumber = new TotalOddnumber();
        int resultOnumber = totalOddnumber.sumOddnumber();
        System.out.println("tổng các số lẻ là: " + resultOnumber);

//        Division division = new Division();
//        division.division();

    }

}