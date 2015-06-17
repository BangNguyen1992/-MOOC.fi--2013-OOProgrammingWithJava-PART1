
public class Main {

    public static void main(String[] args) {
        // write testcode here
        MyDate second = new MyDate(9,3,2012);
        MyDate first = new MyDate(10,3,2011);
        
        System.out.println( second + " and " + first + " difference in years: " + first.differenceInYears(second) );

    }
}
