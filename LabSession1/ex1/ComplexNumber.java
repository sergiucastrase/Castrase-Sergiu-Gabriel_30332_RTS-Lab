package LabSession1.ex1;

// Represents a complex number with real and imaginary parts
public class ComplexNumber {
    // Fields to store the real and imaginary parts of the complex number
    private final double real;
    private final double imaginary;

    // Constructor to initialize the complex number with real and imaginary parts
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add this complex number with another complex number
    public ComplexNumber add(ComplexNumber other) {
        // Add the real parts and the imaginary parts separately
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to subtract another complex number from this complex number
    public ComplexNumber subtract(ComplexNumber other) {
        // Subtract the real parts and the imaginary parts separately
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Method to multiply this complex number with another complex number
    public ComplexNumber multiply(ComplexNumber other) {
        // Multiply the complex numbers using the formula:
        // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
        return new ComplexNumber(this.real * other.real - this.imaginary * other.imaginary,
                this.real * other.imaginary + this.imaginary * other.real);
    }

    // Method to return a string representation of the complex number
    @Override
    public String toString() {
        // Format the complex number as "real + imaginary"
        return String.format("%.1f + %.1fi", real, imaginary);
    }
}
