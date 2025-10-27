package racingcar;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        String[] names = InputView.readCarNames();
        int attemptCount = InputView.readAttemptCount();

        List<Car> cars = Arrays.stream(names)
                .map(Car::new)
                .toList();

        RacingGame game = new RacingGame(cars, attemptCount);
        game.play();

        OutputView.printWinners(game.getWinners());
    }
}
