public class Total {
    public void tong (){
        int total = 0;
        for (int a = 1; a < 100; a++) {
            total += a;
        }
        System.out.println("tong cac chu so la = " + total);

        double result = (double) total / 7;
        String formattedResult = String.format("%.2f", result);
        System.out.println("chia 7 = " + formattedResult);
    }
}
