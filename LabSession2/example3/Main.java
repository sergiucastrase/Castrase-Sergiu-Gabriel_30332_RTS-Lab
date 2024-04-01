package LabSession2.example3;

public class Main {
    // Static variable to hold the sum of divisors
    static int sumOfDivisors = 0;

    public static void main(String[] args) {
        JoinTestThread w1 = new JoinTestThread("Thread 1", null);
        JoinTestThread w2 = new JoinTestThread("Thread 2", w1);
        w1.start();
        w2.start();

        try {
            w1.join();
            w2.join();
            System.out.println("Total sum of divisors: " + sumOfDivisors);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to calculate the sum of divisors
    public static synchronized void addDivisorsSum(int threadSum) {
        sumOfDivisors += threadSum;
    }
}

class JoinTestThread extends Thread {
    Thread t;

    JoinTestThread(String n, Thread t) {
        this.setName(n);
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " has entered the run() method");
        try {
            if (t != null) t.join();
            System.out.println("Thread " + getName() + " executing operation.");

            int number = (getName().equals("Thread 1")) ? 50001 : 20001; // Simple example, modify as needed
            int sum = calculateSumOfDivisors(number);

            System.out.println("Thread " + getName() + " sum of divisors: " + sum);

            // Synchronize adding to the sum to ensure thread safety
            Main.addDivisorsSum(sum);

            System.out.println("Thread " + getName() + " has terminated operation.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int calculateSumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
