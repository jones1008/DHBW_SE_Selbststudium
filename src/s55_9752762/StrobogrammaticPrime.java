package s55_9752762;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StrobogrammaticPrime extends Prime implements IStrategy{
    public MatrixItem[][] fillMatrix(MatrixItem[][] face) {
        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(11, 101, 181, 619, 16091, 18181, 19861, 61819, 116911, 119611));
        return fillMatrix(face, list);
    }
}
