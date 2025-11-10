import java.util.Scanner;
public class ConvertFeet{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Input a number in feet: ");
    double feet = input.nextDouble();
    double meter = feet * 0.305;
    System.out.printf("%f feet is %f meters%n", feet, meter);
}
}
