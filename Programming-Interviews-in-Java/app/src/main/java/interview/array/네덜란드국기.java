package interview.array;

import java.util.Collections;
import java.util.List;

class 네덜란드국기 {
    public static void solution(int pivotIndex, List<Color> A) {
        Color pivot = A.get(pivotIndex);
        int smaller = 0;
        int equal = 0;
        int larger = A.size();

        while (equal < larger) {
            if (A.get(equal).ordinal() < pivot.ordinal()) {
                Collections.swap(A, smaller++, equal++);
            } else if (A.get(equal).ordinal() == pivot.ordinal()) {
                ++equal;
            } else {
                Collections.swap(A, equal, --larger);
            }
        }
    }
}

enum Color {
    RED,
    WHITE,
    BLUE,
}
