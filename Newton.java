import java.util.Scanner;
public class Newton{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Input initial velocity: ");
    double initialVelocity = input.nextDouble();
    System.out.println("Input time taken: ");
    int timeTaken = input.nextInt();
    System.out.println("Input acceleration: ");
    double acceleration = input.nextDouble();
    double distanceCovered = initialVelocity * timeTaken + (0.5*acceleration*timeTaken*timeTaken);
    System.out.printf("The distance covered is %f%n", distanceCovered);
}
}
