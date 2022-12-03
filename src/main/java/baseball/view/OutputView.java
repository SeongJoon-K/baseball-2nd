package baseball.view;

import baseball.Computer;
import baseball.domain.BaseballGame;

public class OutputView {
    private static final int BALL_COUNT_INDEX = 0;
    private static final int STRIKE_COUNT_INDEX = 1;
    private static final String BLANK = " ";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";
    public static void printGameStartMsg() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printUserNumberInputMsg() {
        System.out.println("숫자를 입력해주세요 : ");
    }

    public static void printGameCount(BaseballGame gameCount) {
        System.out.print(gameCount.get(BALL_COUNT_INDEX) + BALL + BLANK);
        System.out.print(gameCount.get(STRIKE_COUNT_INDEX) + STRIKE);
    }
}
