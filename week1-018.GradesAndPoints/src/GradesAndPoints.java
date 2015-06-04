
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int point = Integer.parseInt(reader.nextLine());
        String grade = "";
        if ((point < 30) && (point >= 0)) {
            grade = "failed";
        } else if ((point < 35) && (point >= 30)) {
            grade = "1";
        } else if ((point < 40) && (point >= 35)){
            grade = "2";
        } else if ((point < 45) && (point >= 40)){
            grade = "3";
        } else if ((point < 50) && (point >= 45)){
            grade = "4";
        } else if ((point <= 60) && (point >= 50)){
            grade = "5";
        }
        System.out.println("Grade: "+ grade);
    }
}
