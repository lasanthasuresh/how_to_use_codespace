import java.util.Scanner;

public class PowerCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the base number: ");
    double base = scanner.nextDouble();

    System.out.println("Enter the exponent: ");
    double exponent = scanner.nextDouble();

    double power = calculatePower(base, exponent);

    System.out.println("The power of " + base + " raised to " + exponent + " is " + power);

    scanner.close();
  }

  /**
   * Calculates the power of a base number raised to an exponent.
   * 
   * @param base     The base number.
   * @param exponent The exponent.
   * @return The result of base^exponent.
   */
  private static double calculatePower(double base, double exponent) {
    double result = 1;

    for (int i = 0; i < exponent; i++) {
      result *= base;
    }

    return result;
  }
}
