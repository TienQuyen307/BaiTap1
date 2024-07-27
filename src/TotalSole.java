public class TotalSole {
    public void tongSole (){
        int totalSole = 0;
        for (int a = 1; a < 100; a++) {
            if (a % 2 != 0) {
                totalSole += a;
            }
        }
        System.out.printf("tong cac so le = "+ totalSole +"\n");
    }
}
