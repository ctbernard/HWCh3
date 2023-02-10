/**
 * @class: HWCh3.InterpretBMI
 * @author Chris Bernard
 * @course ITEC 2140
 * @version 1.0
 * @date February 2
 * description: this program will determine your bmi from your weight (in pounds) and your height (in inches).
 */
import java.util.Scanner;

public class InterpretBMI {
    public static void main(String[] args) {
        double weight;
        double height;
        Scanner scanner = new Scanner(System.in);

        double bmiValue;
        System.out.println("[This is a BMI Calculator]");
        System.out.print("Enter your weight in pounds: ");
        weight = scanner.nextDouble() * .4536; //Entered in weight from pounds saved directly to kilograms
        System.out.print("Enter your height in inches: ");
        height = scanner.nextDouble() * .0254; //Entered in height from inches saved directly to meters

        bmiValue = weight / (height * height);

        if (bmiValue < 18.5) {
            System.out.println("You are underweight");
        } else if (18.5 <= bmiValue && bmiValue <= 25.0) {
            System.out.println("You are normal weight");
        } else if (25.0 <= bmiValue && bmiValue <= 30.0) {
            System.out.println("You are overweight");
        } else if (bmiValue >= 30.0) {
            System.out.println("You are obese");
        }
    }

}
