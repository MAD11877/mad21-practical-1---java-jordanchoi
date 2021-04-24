import java.util.Scanner;
import java.text.DecimalFormat;

public class Question2
{
  private static DecimalFormat df2 = new DecimalFormat("#.##");
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    // System.out.print("Please enter your height. (cm): ");
    double height = in.nextDouble();
    // System.out.print("Please enter your weight. (kg): ");
    double weight = in.nextDouble();
    double bmi = weight / (height * height); 
    // formula followed by HealthHub yall don't accept :((weight / height / height) * 10000;
    System.out.println(df2.format(bmi));
    // System.out.printf("'.%2f'", bmi);
    in.close();
  }
}
