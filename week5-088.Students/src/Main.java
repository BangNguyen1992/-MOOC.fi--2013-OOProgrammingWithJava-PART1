
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String name = "";
        String stdNo = "";
        while (true) {
            System.out.println("name: ");
            name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("studentnumber: ");
            stdNo = reader.nextLine();
            list.add(new Student(name,stdNo));
        }
        
        for (Student st : list) {
            System.out.println(st);
        }
        
        System.out.println("");
        System.out.println("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result:");
        for (Student st : list) {
            if (st.getName().contains(term)) {
                System.out.println(st);
            }
        }
    }
}