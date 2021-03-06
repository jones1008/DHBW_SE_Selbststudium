package s55_9752762;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MountainPrime extends Prime implements IStrategy {
    public MatrixItem[][] fillMatrix(MatrixItem[][] face) {
        List<Integer> list = new LinkedList<>();

        // kürzere Liste genommen, weil sonst der Platz im MagnetStripe (<=400 Zeichen) nicht gereicht hätte
        list.addAll(Arrays.asList(131, 151, 181, 191, 1231, 1291, 1321, 1361, 124781, 124951, 124981));
//        list.addAll(Arrays.asList(131, 151, 181, 191, 1231, 1291, 1321, 1361, 1381, 1451, 1471, 1481, 1531, 1571, 1621,
//                1721, 1741, 1831, 1861, 1871, 1931, 1951, 12391, 12421, 12451, 12491, 12541, 12641, 12671, 12721, 12781,
//                12791, 12821, 12841, 12941, 13421, 13451, 13591, 13681, 13691, 13721, 13751, 13781, 13831, 13841, 13921,
//                13931, 14321, 14561, 14591, 14621, 14731, 14741, 14821, 14831, 14851, 14891, 14951, 15641, 15671, 15731,
//                15761, 15791, 15971, 16421, 16741, 16831, 16871, 16921, 16931, 16981, 17321, 17431, 17851, 17891, 17921,
//                17971, 17981, 18521, 18541, 18731, 19421, 19531, 19541, 19751, 19841, 19861, 123491, 123581, 123631,
//                123731, 123791, 123821, 123931, 123941, 124541, 124561, 124721, 124781, 124951, 124981)
//        );
        return fillMatrix(face, list);
    }
}
