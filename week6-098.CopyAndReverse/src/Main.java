

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int[] copy(int[] array) {
        int[] copiedArray = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            reversedArray[i] = array[array.length-1-i];
        }
        return reversedArray;
    }
}
