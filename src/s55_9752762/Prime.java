package s55_9752762;

import java.util.List;

public abstract class Prime {
    protected MatrixItem[][] fillMatrix(MatrixItem[][] face, List<Integer> list) {
        for (int i = 0; i < face.length; i++) {
            for (int j = 0; j < face[i].length; j++) {
                if (list.contains(face[i][j].getIndex())) {
                    face[i][j].setValue(1);
                    if (face[i][j].getIndex() == list.get(list.size() - 1)) {
                        return face;
                    }
                }
            }
        }
        return face;
    }
}
