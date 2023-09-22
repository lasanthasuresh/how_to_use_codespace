import java.util.Scanner;

public class PowerCalculator {

  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the base number: ");
    double baseNumber = scanner.nextDouble();

    System.out.println("Enter the exponentNumber: ");
    double exponentNumber = scanner.nextDouble();

    double power = calculatePower(baseNumber, exponentNumber);

    System.out.println("The power of " + baseNumber + " raised to" + exponentNumber + " is " + power );
  }


  // Power calculation function
  private static double calculatePower(double baseNumber, double exponentNumber) 
  {
    double calculatedResult = 1;

    for (int i = 0; i < exponentNumber; i++) 
    {
      calculatedResult *= baseNumber;
    }

    return calculatedResult;
  }
}
