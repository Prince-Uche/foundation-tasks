import java.util.Scanner;
public class Financialapplication{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter balance: ");
    double balance = input.nextDouble();
    System.out.println("Enter annual percentage interest rate: ");
    double interestRate = input.nextDouble();
    double interest = balance * (interestRate/1200);
    System.out.printf("The interest for next month is: %f%n", interest);
}
}
