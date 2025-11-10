import java.util.Scanner;
public class AirplaneRunwayLength{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter speed: ");
    double speed = input.nextDouble();
    System.out.println("Enter acceleration: ");
    double acceleration = input.nextDouble();
    double runwayLength = (speed*speed) / (2*acceleration);
    System.out.printf("The minimum airplane runway length is: %f%n", runwayLength);
}
}
