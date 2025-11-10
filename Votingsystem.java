import java.util.Scanner;
public class VotingSystem{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter age: ");
    int age = input.nextInt();
    if (age >= 18){
    System.out.printf("You are eligible to vote %n");
}
    else {
    System.out.printf("You are not eligible to vote %n");
}
}
}
