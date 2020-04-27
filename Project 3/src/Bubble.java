import java.util.Arrays;

public class Bubble {
    public static void main(StringExample[] args) {
        int[] array = {4, 2, 3, 5, 1};
        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] < array[i + 1]) {
                    int k = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = k;
                }
                System.out.println("Итерация " + j + " " + Arrays.toString(array));
            }

        }
    }
}
