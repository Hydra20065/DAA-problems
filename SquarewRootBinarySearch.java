import java.util.Scanner;


class SquarewRootBinarySearch {
    public static double squareRoot(int number, double precision) {
        double low = 0, high = number, mid = 0;

        while (high - low > precision) {
            mid = (low + high) / 2;
            if (mid * mid > number) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return mid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        double precision = 1e-6; // Precision up to 6 decimal places
        double result = squareRoot(number, precision);

        System.out.printf("Square root of %d is approximately: %.6f%n", number, result);

        scanner.close();
    }
}
