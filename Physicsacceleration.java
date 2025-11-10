import java.util.Scanner;
public class PhysicsAcceleration{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter starting velocity: ");
    double startingVelocity = input.nextDouble();
    System.out.println("Enter ending velocity: ");
    double endingVelocity = input.nextDouble();
    System.out.println("Enter time span: ");
    double timeSpan = input.nextDouble();
    double averageAcceleration = (endingVelocity-startingVelocity) / timeSpan;
    System.out.printf("The average acceleration is: %f%n", averageAcceleration);    
}
}
