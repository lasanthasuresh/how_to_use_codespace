"""
EG/2020/4289
Wijebanfara P.A.I
"""
def calculate_power(base, exponent):
    """
    Calculate the power of a base raised to a given exponent.

    Parameters:
    base (int): The base number.
    exponent (int): The exponent to which the base is raised.

    Returns:
    int: The result of raising the base to the exponent.
    """
    result = 1
    for _ in range(exponent):
        result *= base
    return result


def main():
    """
    Main function to get user input for base and exponent,
    calculate the power, and print the result.
    """
    base = int(input("Enter the base number: "))
    exponent = int(input("Enter the exponent: "))

    power = calculate_power(base, exponent)
    print(f"The power of {base} raised to {exponent} is {power}")



if __name__ == "__main__":
    main()
 