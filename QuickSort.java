import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {

    QuickSort(ArrayList<Integer> inputList) {
        quickSort(inputList, 0, inputList.size() - 1);
    }

    private void quickSort(ArrayList<Integer> inputList, int low, int high) {

        if (low > high) return;
        int pivotIndex = partition(inputList, low, high);
        quickSort(inputList, low, pivotIndex - 1);
        quickSort(inputList, pivotIndex + 1, high);
    }

    private int partition(ArrayList<Integer> inputList, int low, int high) {

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (inputList.get(j) < inputList.get(high)) {
                Collections.swap(inputList, ++i, j);
            }
        }
        Collections.swap(inputList, high, ++i);
        return i;
    }
}
