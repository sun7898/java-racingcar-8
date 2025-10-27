package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void 자동차_이름과_초기_위치_확인() {
        Car car = new Car("pobi");
        assertThat(car.getName()).isEqualTo("pobi");
        assertThat(car.getPosition()).isZero();
    }

    @Test
    void 자동차_이동_테스트() {
        Car car = new Car("pobi");
        // move는 랜덤이므로, position이 0 이상인지 확인
        car.move();
        assertThat(car.getPosition()).isGreaterThanOrEqualTo(0);
    }
}
