import java.util.*;

class IntegerThread extends Thread {
    public void run() {
        Random random = new Random();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        // Generate 10 random numbers and separate into even and odd
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        // Start threads for all even numbers
        for (int num : evenNumbers) {
            EvenThread1 even = new EvenThread1(num);
            even.start();
            try {
                even.join(); // Ensure one thread finishes before starting the next
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        // Start threads for all odd numbers
        for (int num : oddNumbers) {
            OddThread1 odd = new OddThread1(num);
            odd.start();
            try {
                odd.join(); // Ensure one thread finishes before starting the next
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class EvenThread1 extends Thread {
    private final int num;

    EvenThread1(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Even Integer: " + num);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class OddThread1 extends Thread {
    private final int num;

    OddThread1(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Odd Integer: " + num);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class OddThreadEvenThread {
    public static void main(String[] args) {
        IntegerThread integerThread = new IntegerThread();
        integerThread.start();
    }
}
