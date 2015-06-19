
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        // write testcode here
    }

    public static int smallest(int[] array) {
        // write the code here
        int smallestSoFar = array[0];
        for (int i : array) {
            if (i < smallestSoFar) {
                smallestSoFar = i;
            }
        }
        return smallestSoFar;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int i = 0;
        while (true) {
            if (array[i] == smallest(array)) {
                break;
            }
            i++;
        }
        return i;
    }

    public static int indexOfTheSmallestStartingFrom(int[] table, int startIndex) {
        int theIndexOfSmallest = startIndex;
 
        for (int i = startIndex; i < table.length; i++) {
            if ( table[i]<table[theIndexOfSmallest]) {
                theIndexOfSmallest = i;
            }
        }
        return theIndexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] table){
        for (int i = 0; i < table.length-1; i++) {
             int theIndexOfTheSmallest = indexOfTheSmallestStartingFrom(table, i);
             swap(table, i, theIndexOfTheSmallest);
        }
    }
}
