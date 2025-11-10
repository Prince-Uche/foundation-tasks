import java.util.Scanner;
public class PoundsConversion{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number in pounds: ");
    double pounds = input.nextDouble();
    double kilograms = pounds * 0.454;
    System.out.printf("%f pounds is %f kilograms%n", pounds, kilograms);      
}
}
