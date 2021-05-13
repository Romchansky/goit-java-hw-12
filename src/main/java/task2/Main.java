package task2;


public class Main {
    public static void main(String[] args) {
        CustomThreadPoolExecutor poolExecutor = new CustomThreadPoolExecutor(3);
        poolExecutor.execute(new MyRunnable());
        poolExecutor.shutdown();
    }
}
