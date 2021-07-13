import java.util.ArrayList;

public class Sort {

    Sort(ArrayList<Integer> inputList) { // 100 200 700 1000 2300 2500 - 5 1 3 1 1 1 1 1 1 1

        int min = inputList.get(0); // 100 - 1
        int max = inputList.get(0); // 2500 - 5
        for (Integer i : inputList) {
            if (i < min) min = i;
            if (i > max) max = i;
        }

        int range = max - min; // 2500-100=2400 - 5-1 = 4
        int ratio = range / inputList.size(); // 2400/6=400 -0.4

        if (ratio <= 1) {
            //radix sort
        } else {

        }
    }
}
