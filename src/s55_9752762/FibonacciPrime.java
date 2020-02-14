package s55_9752762;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FibonacciPrime implements IStrategy {
    public MatrixItem[][] fillMatrix(MatrixItem[][] face) {
        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(2, 3, 5, 13, 89, 233, 1597, 28657));
        for (int i = 0; i < face.length; i++) {
            for (int j = 0; j < face[i].length; j++) {
                if (list.contains(face[i][j].getIndex())) {
                    face[i][j].setValue(1);
                    if (face[i][j].getIndex() == 28657) {
                        return face;
                    }
                }
            }
        }
        return face;
    }
}
