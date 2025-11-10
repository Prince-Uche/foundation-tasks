import java.util.Scanner;
public class Healthapplication{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Input weight in pounds: ");
    double poundsWeight = input.nextDouble();
    System.out.println("Input height in inches: ");
    double inchesHeight = input.nextDouble();
    double kiloWeight = poundsWeight * 0.45359237;
    double meterHeight = inchesHeight * 0.0254;
    double Bmi = kiloWeight / (meterHeight*meterHeight);
    System.out.printf(" BMI is %f%n", Bmi);
}
}
