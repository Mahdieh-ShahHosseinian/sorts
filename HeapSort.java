import java.util.ArrayList;
import java.util.Collections;

public class HeapSort {

    private static int lastIndex;

    HeapSort(ArrayList<Integer> input) {
        heapSort(input);
    }

    private void heapSort(ArrayList<Integer> input) {

        lastIndex = input.size();

        for (int i = (lastIndex / 2) - 1; i > -1; i--)
            heapify(input, i);

        for (int i = lastIndex - 1; i > 0; i--) {
            Collections.swap(input, 0, i);
            lastIndex--;
            heapify(input, 0);
        }
    }

    private void heapify(ArrayList<Integer> input, int i) {

        int root = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < lastIndex && input.get(leftChild) > input.get(root)) root = leftChild;
        if (rightChild < lastIndex && input.get(rightChild) > input.get(root)) root = rightChild;

        if (root != i) {
            Collections.swap(input, i, root);
            heapify(input, root);
        }
    }
}
