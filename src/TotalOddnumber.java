public class TotalOddnumber {
    public int sumOddnumber (){
        int totalSole = 0;
        for (int a = 1; a < 100; a++) {
            if (a % 2 != 0) {
                totalSole += a;
            }
        }
        return totalSole;
    }
}
