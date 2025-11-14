import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        QuickSort sorter = new QuickSort();
        int[] arr = {34, 7, 23, 32, 5, 62};
        sorter.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
