import java.util.ArrayList;

public class CountingSort {

    public static int RANGE = 9;

    CountingSort(ArrayList<Integer> arrayList) {
        countAndModify(arrayList);
    }

    private void countAndModify(ArrayList<Integer> input) {

        ArrayList<Integer> output = new ArrayList<>(input.size());
        ArrayList<Integer> count = new ArrayList<>(RANGE);

        for (int i = 0; i < input.size(); i++) output.add(0);
        for (int i = 0; i < RANGE; i++) count.add(0);

        for (Integer integer : input) count.set(integer, count.get(integer) + 1);
        for (int i = 1; i < count.size(); i++) count.set(i, count.get(i - 1) + count.get(i));
        for (Integer integer : input) {
            output.set(count.get(integer) - 1, integer);
            count.set(integer, count.get(integer) - 1);
        }
        for (int i = 0; i < input.size(); i++) input.set(i, output.get(i));
    }
}