import java.util.Scanner;
public class Tripcost{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter distance to drive: ");
    double driveDistance = input.nextDouble();
    System.out.println("Enter miles per gallon: ");
    double fuelEfficiency = input.nextDouble();
    System.out.println("Enter price per gallon: ");
    double gallonPrice = input.nextDouble();
    double cost = gallonPrice * (driveDistance/fuelEfficiency);
    System.out.printf("The cost of driving is: %f%n", cost);    
}
}
