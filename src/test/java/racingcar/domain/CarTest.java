package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    @Test
    void car_move테스트() {
        Car car = new Car(new CarName("pobi"), new Position(0));
        car.move(() -> true);
        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }
}
