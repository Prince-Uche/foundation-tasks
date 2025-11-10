import java.util.Scanner;
public class Eggs{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("How many eggs do you have: ");
    int eggNumber = input.nextInt();
    int gross = eggNumber / 144;
    int dozen = eggNumber / 12;
    int leftOver = eggNumber % 12;
    if(eggNumber > 500){
    System.out.printf("Your number of eggs is:%n Gross: %d%n Dozen: %d%n Leftover: %d%n", gross, dozen, leftOver);
}
    else{
    System.out.println("Your eggs are below 500");
}
}
}
