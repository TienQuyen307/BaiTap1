

public class Main {
    public static void main(String[] args) {
        for (int a = 1; a < 100; a++) {
            System.out.println(a+ "");
        }

        int totalSole = 0;
        for (int a = 1; a < 100; a++) {
            if (a % 2 != 0) {
                totalSole += a;
            }
        }
        System.out.printf("tong cac so le = "+ totalSole +"\n");

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