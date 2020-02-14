package s55_9752762;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StrobogrammaticPrime implements IStrategy{
    public MatrixItem[][] fillMatrix(MatrixItem[][] face) {
        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(11, 101, 181, 619, 16091, 18181, 19861, 61819, 116911, 119611));

        for (int i = 0; i < face.length; i++) {
            for (int j = 0; j < face[i].length; j++) {
                if (list.contains(face[i][j].getIndex())) {
                    face[i][j].setValue(1);
                    if (face[i][j].getIndex() == 119611) {
                        return face;
                    }
                }
            }
        }
        return face;
    }
}
