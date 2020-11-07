public class SumOfThread extends Thread {
    private int startIndex;
    private int endIndex;
    private long sum = 0;
    private int[] arr;

    public SumOfThread(int startIndex, int endIndex, int[] arr) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.arr = arr;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex; ++i) {
            sum += arr[i];
        }
    }
}
