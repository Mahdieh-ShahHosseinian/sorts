import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {

    InsertionSort(ArrayList<Integer> input) {
        insertionSort(input);
    }

    private void insertionSort(ArrayList<Integer> input) {

        for (int i = 1; i < input.size(); i++)
            for (int j = 0; j < i; j++)
                if (input.get(i) > input.get(j)) Collections.swap(input, i, j);
    }
}
