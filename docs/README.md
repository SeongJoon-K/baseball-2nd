## 숫자 야구 게임에 대한 설명
- 숫자 야구 게임은 1부터 9까지의 서로 다른 수로 이루어진 3자리 수를 맞추는 게임  
- 게임은 숫자를 맞출 때까지 진행되어야 한다.

## 숫자 야구 게임 실행 순서
1. 게임을 실행하는 메세지가 출력된다.
2. 세 자리의 숫자를 입력 받는다
3. 입력 받은 숫자에 대해서 스트라이크인지 볼인지 판단한다.
4. 3스트라이크를 모두 맞췄을 때, 메세지를 출력한다
5. 게임의 재시작 여부를 묻는 메세지를 출력한다.
6. 재시작시 해당 로직을 다시 실행한다

### 필요한 클래스
- view    
  - InputView  
  - OutputView

- domain
  - 스트라이크인지 볼인지 판단하는 Refree 클래스
  - 게임의 실행 종료 여부를 판단하는 baseballGame 클래스
  - 스트라이크, 볼, 낫싱 상수를 관리하는 hint Enum 클래스

- controller 
  - 도메인의 데이터를 관리해 이용하는 controller 클래스

- Validator
  - 입력의 예외를 관리하는 클래스

