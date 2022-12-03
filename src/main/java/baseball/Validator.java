package baseball;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Validator {
    /*
     1. 사용자에 입력값에 중복이 있는 경우
     2. 사용자의 입력값에 0이 있는 경우


     */
    public void validateDuplicateNumber(List<Integer> userNumberInput) {
        LinkedHashSet<Integer> checkDuplicate = new LinkedHashSet<>(userNumberInput);
        if (checkDuplicate.size() != 3) {
            throw new IllegalArgumentException("[ERROR]");
        }
    }
}
