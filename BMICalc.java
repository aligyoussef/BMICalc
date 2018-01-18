import java.util.Scanner;
public class BMICalc
{
   public static void main(String[] args)
     {
         final double MetersToInches = 0.0254;
         final double PoundsToKg = 0.453592;
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter weight in pounds: ");
         double weight = input.nextDouble();
         
         System.out.println("Enter feet for height: ");
         double heightFeet = input.nextDouble();
         System.out.println("Enter inches for height: ");
         double heightInch = input.nextDouble();
         
         double finalHeightIn = (heightFeet*12) + heightInch;
         
         double convertToMeter = finalHeightIn*MetersToInches;
         double convertToKg = weight*PoundsToKg;
          
         double BMI = convertToKg/(convertToMeter * convertToMeter);
         
         if(BMI < 18.5)
         {
            System.out.println("Your BMI is " + BMI + "." + "You are underweight");
         }
         else if(BMI >= 18.5 && BMI <= 24.9)
         {
            System.out.println("Your BMI is " + BMI + "." + "You are a normal weight");
         }
         else if(BMI >= 25 && BMI <=29.9)
         {
            System.out.println("Your BMI is " + BMI + "." + "You are overweight");
         }
         else if(BMI > 30)
         {
            System.out.println("Your BMI is " + BMI + "." + "You are obese");
         }
     }
}