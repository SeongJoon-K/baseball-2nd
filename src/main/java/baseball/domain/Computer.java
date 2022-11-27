package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Computer implements ComputerNumberGenerate {

    /*
    현재 컴퓨터에서 랜덤으로 생성하는 숫자 리스트를 만들어야함
    컴퓨터 클래스에서는 그럼 컴푸터의 List 를 반환해야한다.
     */
    private List<Integer> computerNumbers;

    public Computer(List<Integer> computerNumbers) {
        this.computerNumbers = computerNumbers;
    }

    private List<Integer> generateComputerRandomNumbers() {
        while (computerNumbers.size() < 3) {
            int randomNumber = generate();
            if (computerNumbers.contains(randomNumber)) {
                computerNumbers.add(randomNumber);
            }
        }
        return computerNumbers;
    }

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(1, 9);
    }
}
