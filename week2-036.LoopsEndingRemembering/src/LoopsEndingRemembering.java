import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int num=0, sum=0, numCnt=0, numEven=0;
        while(true) {
            num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                break;
            }
            sum += num;
            numCnt++;
            if (num % 2 == 0) {
                numEven++;
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+ sum);
        System.out.println("How many numbers: "+ numCnt);
        System.out.println("Average: "+ (sum*1.0/numCnt));
        System.out.println("Even numbers: "+ numEven);
        System.out.println("Odd numbers: "+ (numCnt-numEven));
    }
}
