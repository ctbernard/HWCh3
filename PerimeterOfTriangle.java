/**
 * @class: HWCh3.PerimeterOfTriangle
 * @author Chris Bernard
 * @course ITEC 2140
 * @version 1.0
 * @date February 9
 * description: this program will determine if a triangle is possible given the three sides and will return the perimeter if valid
 */

import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[Triangle Perimeter Finding Calculator] Enter how long sides for your triangle are");
        System.out.print("First side: ");

        double firstSide = scanner.nextDouble();

        System.out.print("Second side: ");

        double secondSide = scanner.nextDouble();
        System.out.print("Last side: ");

        double lastSide = scanner.nextDouble();

        if ((firstSide + secondSide) > lastSide && (firstSide + lastSide) > secondSide && (secondSide + lastSide) > firstSide) {
            System.out.print("The perimeter of the triangle is: ");
            System.out.println(firstSide + secondSide + lastSide);
        } else {
            System.out.println("invalid input");
        }
    }
}
