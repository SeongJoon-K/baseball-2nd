package baseball.domain;

import baseball.Computer;
import baseball.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    private List<Integer> userInputNumbers;
    private List<Integer> gameCount;

    /**
     * 스트라이크는 어디에 저장되는게 맞을까 ?*/

    public BaseballGame(List<Integer> gameCount) {
        int userInput = InputView.inputUserNumber();
        this.userInputNumbers = generateUserInput(userInput);;
        this.gameCount = gameCount;
    }

    public List<Integer> getUserInputNumbers() {
        return userInputNumbers;
    }

    private List<Integer> generateUserInput(int userInput) {
        List<Integer> userNumbers = new ArrayList<>();
        userNumbers.add(userInput/100);
        userNumbers.add(userInput/10%10);
        userNumbers.add(userInput%10);
        return userNumbers;
    }

    private int isStrike(Computer computerNumbers) {
        int strikeCount = 0;
        for (int i = 0; i < userInputNumbers.size(); i++) {
            if(userInputNumbers.get(i) == computerNumbers.get(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    private int isBall(Computer computerNumbers) {
        userInputNumbers.retainAll(computerNumbers.getComputerNumbers());
        return userInputNumbers.size() - isStrike(computerNumbers);
    }

    public List<Integer> getGameCount() {
        return gameCount;
    }

    public void addBaseballCount(Computer computerNumbers) {
        gameCount.add(isBall(computerNumbers));
        gameCount.add(isStrike(computerNumbers));
    }
    private boolean isNothing(Computer computerNumbers) {
        return isStrike(computerNumbers) == 0 && isBall(computerNumbers) == 0;
    }

    public int get(int ballCountIndex) {
        return gameCount.get(ballCountIndex);
    }
}
