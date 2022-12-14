package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerNumberGenerate {

    /*
    현재 컴퓨터에서 랜덤으로 생성하는 숫자 리스트를 만들어야함
    컴퓨터 클래스에서는 그럼 컴푸터의 List 를 반환해야한다.
     */
    private List<Integer> computerNumbers;

    public Computer() {
        this.computerNumbers = generateComputerRandomNumbers();
    }

    public List<Integer> getComputerNumbers() {
        return computerNumbers;
    }

    private List<Integer> generateComputerRandomNumbers() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = computerNumberGenerate();
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public int get(int index) {
        return computerNumbers.get(index);
    }


    @Override
    public int computerNumberGenerate() {
        return Randoms.pickNumberInRange(1, 9);
    }
}
