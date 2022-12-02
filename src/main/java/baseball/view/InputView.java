package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    /**
     * 유저가 입력한 값을 출력함.
     */
    public static int inputUserNumber() {
        return Integer.parseInt(Console.readLine());
    }
}
