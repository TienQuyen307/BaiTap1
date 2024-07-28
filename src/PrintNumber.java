public class PrintNumber {
    private int startNumber;
    private int endNumber;

    public PrintNumber(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public void printNumber() {
        System.out.println("Dãy số từ " + startNumber + " tới " + endNumber + ": " );
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.println(i + " ");
        }
    }

    public int[] getNumber() {
        int[] seriesOfNumber = new int[endNumber - startNumber + 1];
        for (int i = startNumber; i <= endNumber; i++) {
            seriesOfNumber [i - startNumber] = i;
        }
        return seriesOfNumber;
    }
}
