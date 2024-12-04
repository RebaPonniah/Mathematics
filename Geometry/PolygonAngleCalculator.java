import java.util.Scanner;

public class PolygonAngleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of sides
        System.out.print("Enter the number of sides of the polygon (must be 3 or more): ");
        int sides = scanner.nextInt();

        // Validate the number of sides
        if (sides < 3) {
            System.out.println("A polygon must have at least 3 sides.");
        } else {
            // Calculate interior and exterior angles
            double interiorAngle = ((sides - 2) * 180.0) / sides;
            double exteriorAngle = 360.0 / sides;

            // Display the results
            System.out.printf("For a polygon with %d sides:\n", sides);
            System.out.printf("Interior Angle: %.2f degrees\n", interiorAngle);
            System.out.printf("Exterior Angle: %.2f degrees\n", exteriorAngle);
        }

        scanner.close();
    }
}
