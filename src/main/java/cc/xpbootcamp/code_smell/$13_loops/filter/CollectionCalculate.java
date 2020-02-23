package smell.$13_loops.filter;

import java.util.ArrayList;
import java.util.List;

public class CollectionCalculate {

    private int[] input;

    public Integer[] filterEvenNumber() {
        List<Integer> result = new ArrayList();
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                result.add(input[i]);
            }
        }

        return result.toArray(new Integer[result.size()]);
    }
}
