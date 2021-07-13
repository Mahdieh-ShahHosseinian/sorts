import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    BucketSort(ArrayList<Integer> inputList) {
        bucketSort(inputList);
    }

    private static class Bucket {

        ArrayList<Integer> items = new ArrayList<>();
        void addNewItemToBucket(int newItem) {
            items.add(newItem);
        }
    }

    private void bucketSort(ArrayList<Integer> inputList) {

        int times = findMaxLengthOfValues(inputList);
        Bucket[] buckets = new Bucket[10];
        for (int i = 0; i < buckets.length; i++) buckets[i] = new Bucket();

        for (int i = 1; i <= times; i++) {

            for (Integer item : inputList) {
                buckets[item % (int) Math.pow(10, i)].addNewItemToBucket(item);
            }

            for (int index = 0, j = 0; j < buckets.length; j++) {
                for (int k = 0; k < buckets[j].items.size(); k++) {
                    inputList.set(index, buckets[j].items.get(k));
                }
            }
        }
    }

    private int findMaxLengthOfValues(ArrayList<Integer> inputList) {

        int max = inputList.get(0);
        for (int i = 1; i < inputList.size(); i++) {
            if (inputList.get(i) > max) {
                max = inputList.get(i);
            }
        }
        return Integer.toString(max).length();
    }
}
