import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numerator of A: ");
        int a = Integer.parseInt(sc.nextLine());

        int b;
        while (true) {
            System.out.print("Enter the denominator of A (must be non-zero): ");
            b = Integer.parseInt(sc.nextLine());
            if (b != 0) {
                break;
            }
            System.out.println("Invalid denominator! Denominator cannot be zero. Please try again.");
        }

        System.out.print("Enter the numerator of B: ");
        int c = Integer.parseInt(sc.nextLine());

        int d;
        while (true) {
            System.out.print("Enter the denominator of B (must be non-zero): ");
            d = Integer.parseInt(sc.nextLine());
            if (d != 0) {
                break;
            }
            System.out.println("Invalid denominator! Denominator cannot be zero. Please try again.");
        }

        System.out.printf("Fraction A: %d/%d\n", a, b);
        System.out.printf("Fraction B: %d/%d\n", c, d);

        sc.close();
    }
}