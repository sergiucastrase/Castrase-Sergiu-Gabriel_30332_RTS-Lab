package LabSession1.ex3;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbersApp {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // Create an array to hold 10 numbers
        Random random = new Random(); // Create a Random object for generating random numbers

        // Generate 10 random numbers and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Generate a random number between 0 and 99
        }

        // Sort the array
        Arrays.sort(numbers);

        // Display the sorted array
        System.out.println("Sorted numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
