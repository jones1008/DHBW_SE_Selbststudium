package s55_9752762;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FibonacciPrime extends Prime implements IStrategy {
    public MatrixItem[][] fillMatrix(MatrixItem[][] face) {
        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(2, 3, 5, 13, 89, 233, 1597, 28657));
        return fillMatrix(face, list);
    }
}
