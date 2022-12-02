package baseball.domain;

import baseball.Computer;
import baseball.view.InputView;

import java.util.List;

public class BaseballGame {
    private List<Integer> userInputList;

    public BaseballGame(List<Integer> userInputList) {
        this.userInputList = userInputList;
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

    public int isStrike(Computer computerNumbers) {
        int strikeCount = 0;
        for (int i = 0; i < userInputList.size(); i++) {
            if(userInputList.get(i) == computerNumbers.get(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int isBall(Computer computerNumbers) {
        userInputList.retainAll(computerNumbers.getComputerNumbers());
        return userInputList.size() - isStrike(computerNumbers);
    }

    // 유저의 값에서 꺼낸 첫번쨰 숫자랑 ComputerNumber에서 꺼낸 첫번째 숫자랑 비교해야한다.


}
