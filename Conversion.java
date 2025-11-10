import java.util.Scanner;
public class Converter{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter mile value: ");
    double miles = input.nextDouble();
    double kilometers = miles * 1.6;
    System.out.printf("%f miles is exactly %f kilometers%n", miles, kilometers);
}
}
