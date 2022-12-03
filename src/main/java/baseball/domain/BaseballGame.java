package baseball.domain;

import baseball.Computer;
import baseball.view.InputView;

import java.util.List;

public class BaseballGame {
    private List<Integer> userInputList;

    public BaseballGame(List<Integer> userInputList) {
        this.userInputList = generateUserInput();
    }

    public List<Integer> getUserInputList() {
        return userInputList;
    }

    public List<Integer> generateUserInput() {
        int userInput = InputView.inputUserNumber();
        userInputList.add(userInput/100);
        userInputList.add(userInput/10%10);
        userInputList.add(userInput%10);
        return userInputList;
    }

    private int isStrike(Computer computerNumbers) {
        int strikeCount = 0;
        for (int i = 0; i < userInputList.size(); i++) {
            if(userInputList.get(i) == computerNumbers.get(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    private int isBall(Computer computerNumbers) {
        List<Integer> duplicateNumber = userInputList.retainAll(computerNumbers.getComputerNumbers();
        return duplicateNumber.size() - isStrike(computerNumbers);
    }
    private boolean isNothing(Computer computerNumbers) {
        return isStrike(computerNumbers) == 0 && isBall(computerNumbers) == 0;
    }
}
