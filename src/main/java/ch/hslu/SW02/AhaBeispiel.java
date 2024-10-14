package ch.hslu.SW02;

public class AhaBeispiel {
    public static void task(final int n) {
        task1(); task1(); task1(); task1(); // T ~ 4
        for (int i = 0; i < n; i++) { // äussere Schleife: n-mal
            task2(); task2(); task2(); // T ~ n · 3
            for (int j = 0; j < n; j++) { // innerer Schleife: n-mal
                task3(); task3(); // T ~ n · n· 2
            }
        }
    }

    public static void task1() {
        System.out.println("Task1");
    }

    public static void task2() {
        System.out.println("Task2");
    }

    public static void task3() {
        System.out.println("Task3");
    }
}
