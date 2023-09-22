import java.util.Scanner;

public class PowerCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the base number: ");
    double baseNumber = scanner.nextDouble();

    System.out.println("Enter the exponent: ");
    double exponent = scanner.nextDouble();

    double power = calculatePower(baseNumber, exponent);
    System.out.println("The power of " + baseNumber + " raised to" + exponent + " is " +power );
  }

  private static double calculatePower(double baseNumber, double exponent) {
    double result = 1;
    for (int i = 0; i < exponent; i++) {
      result *= baseNumber;
    }
    return result;
  }
}
