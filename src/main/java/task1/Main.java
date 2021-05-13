package task1;

public class Main {
    public static void main(String[] args) {

        H2O h2O = new H2O();

        Runnable releaseHydrogen = () -> System.out.print("H");
        Runnable releaseOxygen = () -> System.out.print("O");

        for (int i = 0; i < 2; i++) {
            new Thread(() -> h2O.oxygen(releaseOxygen)).start();
        }

        for (int i = 0; i < 4; i++) {
            new Thread(() -> h2O.hydrogen(releaseHydrogen)).start();
        }
    }
}
