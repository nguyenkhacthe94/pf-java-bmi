import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight (kg): ");
        float weight = input.nextFloat();
        System.out.println("Enter your height (meter): ");
        float height = input.nextFloat();
        if (weight < 0 || height < 0)
            System.out.println("Your stats are wrong!");
        else {
            double bmi = (float) weight / Math.pow(height, 2);
            if (bmi < 18.5)
                System.out.println("Your BMI is underweight");
            else {
                if (bmi < 25)
                    System.out.println("Your BMI is Normal");
                else {
                    if (bmi < 30)
                        System.out.println("Your BMI is Overweight");
                    else
                        System.out.println("Your BMI is Obese");
                }
            }
            System.out.format("Your BMI number is: %.3f", bmi);
        }
    }
}
