public class TimeDelayRecursion {

    // recursive method
    public static void TimeDelay(int n) {
        if (n == 0)
            return;
        else {
            System.out.println(n + "...");
            oneSecondDelay();
            TimeDelay(n - 1); // recursive call
        }
    }
    public static void main(String[] args) {
        TimeDelay(10);
    }

    public static void oneSecondDelay() {
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ignore) {
        }
    }
}
