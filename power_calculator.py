def calculate_power(base, exponent):
  """Calculates the power of a number when given.


  Returns:
    The power of the base number raised to the exponent.
  """

  result = 1
  for i in range(exponent):
    result *= base
  return result


def main():
  """Prompts the user for two numbers and prints the power of those numbers."""

  base = int(input("Enter the base number: "))
  exponent = int(input("Enter the exponent: "))

  power = calculate_power(base, exponent)
  print(f"The power of {base} raised to {exponent} is {power}")


if __name__ == "__main__":
  main()
