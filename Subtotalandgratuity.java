import java.util.Scanner;
public class SubtotalAndGratuity{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter subtotal: ");
    double subtotal = input.nextDouble();
    System.out.println("Enter gratuity rate: ");
    double gratuityRate = input.nextDouble();
    double gratuity = gratuityRate / subtotal;
    double total = subtotal + gratuity;
    System.out.printf("Gratuity: $%f%n Total: $%f%n", gratuity, total);
    
}
}
