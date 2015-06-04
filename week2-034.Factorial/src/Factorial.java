import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int fact = Integer.parseInt(reader.nextLine());
        int result = 1;
        int i = 1;
        if ( fact > 1 ) {
            while (i <= fact) {
            result *= i;
            i++;
            }   
        }
        System.out.println("Factorial is " + result);
    }
}
