import java.util.Scanner;

public class PowerCalculator {
  //test

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);//dfghjk

    System.out.println("Enter the base nber: "); //test2
    double base = scanner.nextDouble();

    System.out.println("Enter the exponent: ");//test45
    double exponent = scanner.nextDouble();

    double power = calculatePower(base, exponent);
    System.out.println("The power of " + base + " raised to" + exponent + " is " +power );
  }

  private static double calculatePower(double base, double exponent) {
    double result = 1;
    for (int i = 0; i < exponent; i++) {
      result *= base;
    }
    return resut;
  }
}
