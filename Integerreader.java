import java.util.Scanner;
public class IntegerReader{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Insert a number between 0 and 1000: ");
    int integer = input.nextInt();
    int firstValue = integer % 10;
    int secondValue = firstValue % 10;
    int thirdValue = secondValue % 10;
    int sum = firstValue + secondValue + thirdValue;
    if(integer > 0 && integer <= 999){
    System.out.printf("The sum of all it\'s digits is: %d%n", sum);
}
    else{
    System.out.printf("The integer is greater than 1000 and less than 1 %n");
}
}
}
