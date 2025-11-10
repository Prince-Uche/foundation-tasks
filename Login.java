import java.util.Scanner;
public class Login{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String userName; 
    userName = "Uchechukwu";
    int pinCode;
    pinCode = 626262;
    System.out.println("Enter username:");
    String enterName = input.nextLine();
    System.out.println("Enter pin code:");
    int enterCode = input.nextInt();
    if (enterName.equals(userName) && enterCode == pinCode){
    System.out.printf("Login successful %n");
}
    else{
    System.out.printf("Login failed %n");
}
}
}
