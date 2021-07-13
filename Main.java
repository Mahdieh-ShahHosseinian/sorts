import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(8);
        a.add(1);
        a.add(5);
        a.add(13);
        a.add(1);


        HeapSort sort = new HeapSort(a);
        System.out.println(a.toString());
        BinarySearch binarySearch = new BinarySearch(a, 5);
        System.out.println(binarySearch.getIndex());
    }
}
