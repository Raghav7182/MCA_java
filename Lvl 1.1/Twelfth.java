import java.util.Scanner;

public class Twelfth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double height = scanner.nextDouble();

        double areaInSqInches = 0.5 * base * height;

        double areaInSqCm = areaInSqInches * Math.pow(2.54, 2);

        double heightCm = height * 2.54;

        int feet = (int)(height / 12);
        double inches = height % 12;

        System.out.printf("Area of the triangle is %.2f square inches.%n", areaInSqInches);
        System.out.printf("Area of the triangle is %.2f square centimeters.%n", areaInSqCm);
        System.out.printf("Your Height in cm is %.2f cm while in feet is %d ft and inches is %.2f in.%n", heightCm, feet, inches);

    }
}
