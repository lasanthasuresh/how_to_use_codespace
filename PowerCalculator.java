import java.util.Scanner;

public class PowerCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the base number: ");
    double baseValue = scanner.nextDouble();

    System.out.print("Enter the exponent here: ");
    double exponentValue = scanner.nextDouble();

    double powerValue = calculatePower(baseValue, exponentValue);
    System.out.print("The power of " + baseValue + " raised to" + exponentValue + " is " +powerValue );
  }

  private static double calculatePower(double baseValue, double exponentValue) {
    double result = 1;
    for (int i = 0; i < exponentValue; i++) {
      result *= baseValue;
    }
    return result;
  }
}
