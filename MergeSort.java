import java.util.ArrayList;

public class MergeSort {

    MergeSort(ArrayList<Integer> arrayList) {
        divide(arrayList, 0, arrayList.size() - 1);
    }

    private void divide(ArrayList<Integer> arrayList, int left, int right) {

        if (left >= right) return;
        int middle = (left + right) / 2;
        divide(arrayList, left, middle);
        divide(arrayList, middle + 1, right);
        merge(arrayList, left, middle, right);
    }

    private void merge(ArrayList<Integer> arrayList, int start, int middle, int end) {

        ArrayList<Integer> mergedSortedArrayList = new ArrayList<>();

        int leftListIndex = start;
        int rightListIndex = middle + 1;

        while (leftListIndex <= middle && rightListIndex <= end) {

            if (arrayList.get(leftListIndex) <= arrayList.get(rightListIndex)) {
                mergedSortedArrayList.add(arrayList.get(leftListIndex++));
            } else {
                mergedSortedArrayList.add(arrayList.get(rightListIndex++));
            }
        }
        while (leftListIndex <= middle) {
            mergedSortedArrayList.add(arrayList.get(leftListIndex++));
        }
        while (rightListIndex <= end) {
            mergedSortedArrayList.add(arrayList.get(rightListIndex++));
        }

        int i = 0;
        int j = start;
        while (i < mergedSortedArrayList.size()) {
            arrayList.set(j++, mergedSortedArrayList.get(i++));
        }
    }
}
