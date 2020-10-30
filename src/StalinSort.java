import java.util.ArrayList;
import java.util.Arrays;

public class StalinSort {
    public static Integer[] stalinSort(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (result.get(result.size() - 1) <= array[i]) {
                result.add(array[i]);
            }
        }
        Integer[] resultArray = new Integer[result.size()];
        return result.toArray(resultArray);
    }

    public static void main(String[] args) {
        int[] sorted = new int[]{1, 2, 2, 3, 4, 5, 6, 7};
        int[] unsorted = new int[]{3, 1, 2, 4, 6, 3, 2, 4, 7, 5};
        int[] unsorted2 = new int[]{3, 4, 2, 4, 1, 3, 2, 4, 7, 5};
        System.out.println("Unsorted: " + (Arrays.toString(sorted)));
        System.out.println("Sorted:   " + Arrays.toString(stalinSort(sorted)) + "\n");
        System.out.println("Unsorted: " + (Arrays.toString(unsorted)));
        System.out.println("Sorted:   " + Arrays.toString(stalinSort(unsorted)) + "\n");
        System.out.println("Unsorted: " + (Arrays.toString(unsorted2)));
        System.out.println("Sorted:   " + Arrays.toString(stalinSort(unsorted2)));
    }
}
