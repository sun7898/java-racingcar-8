package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class RacingGameTest {

    @Test
    void 우승자_단독_확인() {
        Car car1 = new Car("pobi");
        Car car2 = new Car("jun");

        // 강제로 이동 위치 지정
        for (int i = 0; i < 3; i++) car1.move();
        for (int i = 0; i < 2; i++) car2.move();

        RacingGame game = new RacingGame(List.of(car1, car2), 0);
        List<Car> winners = game.getWinners();

        assertThat(winners).containsExactly(car1);
    }

    @Test
    void 공동_우승자_확인() {
        Car car1 = new Car("pobi");
        Car car2 = new Car("jun");

        for (int i = 0; i < 3; i++) {
            car1.move();
            car2.move();
        }

        RacingGame game = new RacingGame(List.of(car1, car2), 0);
        List<Car> winners = game.getWinners();

        assertThat(winners).containsExactlyInAnyOrder(car1, car2);
    }
}
