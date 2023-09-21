import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the base number
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        // Prompt user for the exponent
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate the power and display the result
        double power = calculatePower(base, exponent);
        System.out.println("The power of " + base + " raised to " + exponent + " is " + power);

        scanner.close(); // Close the scanner to prevent resource leaks
    }

    // Function to calculate the power
    private static double calculatePower(double base, double exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
