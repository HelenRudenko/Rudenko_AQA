import java.util.Arrays;

public class Array {


    public static void main(String[] args) {
        int[] array;
        array = new int[]{32, 140, 1, 0, 5, 2, 56, 77, 11, 8};
        int n = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array [i] >= 50) {
                n++; number of elements (length of array)
            }
        }
        System.out.print("" + n);

        int j = 0;
        int[] newArray = new int[n];
        for (int i = 0; i < array.length; i++) {
            if (array [i] >= 50) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

}




