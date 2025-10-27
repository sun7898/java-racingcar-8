package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        if (name == null || name.isBlank() || name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 1~5자여야 합니다.");
        }
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    // 랜덤 이동 로직은 기능 3에서 구현
    public void move() {
        int randomValue = Randoms.pickNumberInRange(0, 9);
        if (randomValue >= 4) {
            position++;
        }
    }

    public String getProgress() {
        return "-".repeat(position);
    }
}
