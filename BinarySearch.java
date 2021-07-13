import java.util.ArrayList;

public class BinarySearch {

    private final int x;
    private final ArrayList<Integer> sortedList;

    BinarySearch(ArrayList<Integer> arrayList, int x) {
        this.sortedList = arrayList;
        this.x = x;
    }

    private int binarySearch(int left, int right) {

        if (left < right) {

            int middle = (left + right) / 2;

            if (x == sortedList.get(middle)) return middle;
            if (x < sortedList.get(middle)) binarySearch(left, middle);
            binarySearch(middle + 1, right);
        }
        return -1;
    }

    public int getIndex() {
        return binarySearch(0, sortedList.size() - 1);
    }
}
