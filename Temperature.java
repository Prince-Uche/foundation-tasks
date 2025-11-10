import java.util.Scanner;
public class Temperature{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter today\'s temperature: ");
    int todaysTemperature = input.nextInt();
    if (todaysTemperature < 15){
    System.out.printf("Cold %n");
}
    else if (todaysTemperature > 30){
    System.out.printf("Hot %n");
}
    else {
    System.out.printf("Warm %n");
}
}
}
