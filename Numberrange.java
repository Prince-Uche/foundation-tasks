import java.util.Scanner;
public class Range{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = input.nextInt();
    if (number > 0 && number <= 100){
    System.out.printf("In range %n");
}
    else{
    System.out.printf("Out of range %n");
}
}
}
