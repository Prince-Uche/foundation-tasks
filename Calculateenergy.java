import java.util.Scanner;
public class CalculateEnergy{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount of water in kilograms: ");
    double waterAmount = input.nextDouble();
    System.out.println("Enter the initial temperature: ");
    double initialTemperature = input.nextDouble();
    System.out.println("Enter the final temperature: ");
    double finalTemperature = input.nextDouble();
    double energy = waterAmount * (finalTemperature-initialTemperature) * 4184;
    System.out.printf("The energy needed is: %f%n", energy);
}
}
