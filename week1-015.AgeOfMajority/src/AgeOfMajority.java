
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int majorAge = 18;
        System.out.println("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        if (age >= majorAge) {
            System.out.println("You have reached the age of majority!");
        } else {
            System.out.println("You have not reached the age of majority yet!");
        }
    }
}
