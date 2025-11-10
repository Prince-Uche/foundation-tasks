import java.util.Scanner;
public class IntegerReader{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Input the number of minutes: ");
    int minutes = input.nextInt();
    int years = minutes / (365*24*60);
    int remainingMinutes = minutes % (365*24*60);
    int day = remainingMinutes / (24*60);
    System.out.printf("%d minutes is approximately %d years and %d days%n", minutes, years, day);
}
}    
