package racingcar.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {
    List<Car> carList = Arrays.asList(new Car(new CarName("pobi"), new Position(1))
            , new Car(new CarName("woni"), new Position(1))
            , new Car(new CarName("jun"), new Position(1)));

    @ParameterizedTest
    @ValueSource(ints = {0,1,2})
    void sdf(int index) {
        List<String> carNames = Arrays.asList("pobi", "woni", "jun");
        Cars cars = CarsFactory.createCars(carNames);
        cars.race(() -> true);
        assertThat(cars.getCars().get(index).getPosition()).isEqualTo(new Position(1));
    }
}
