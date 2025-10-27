package racingcar;

import java.util.List;

public class RacingGame {

    private final List<Car> cars;
    private final int attemptCount;

    public RacingGame(List<Car> cars, int attemptCount) {
        this.cars = cars;
        this.attemptCount = attemptCount;
    }

    public void play() {
        for (int i = 0; i < attemptCount; i++) {
            playRound();
            OutputView.printRoundResult(cars);
        }
    }

    private void playRound() {
        for (Car car : cars) {
            car.move(); // 랜덤 이동
        }
    }

    public List<Car> getWinners() {
        int maxPosition = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .toList();
    }
}
