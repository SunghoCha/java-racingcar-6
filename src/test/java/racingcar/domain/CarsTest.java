package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {
    List<Car> carList = Arrays.asList(new Car(new CarName("pobi"), new Position(2))
            , new Car(new CarName("woni"), new Position(3))
            , new Car(new CarName("jun"), new Position(3)));

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    void Cars_race테스트(int index) {
        List<String> carNames = Arrays.asList("pobi", "woni", "jun");
        Cars cars = CarsFactory.createCars(carNames);
        cars.race(() -> true);
        assertThat(cars.getCars().get(index).getPosition()).isEqualTo(new Position(1));
    }

    @ParameterizedTest
    @CsvSource({"0,woni", "1,jun"})
    @DisplayName("경주 종료 후 우승자 찾기")
    void findWinner_test(int index, String name) {
        List<Car> carList = Arrays.asList(new Car(new CarName("pobi"), new Position(2))
                , new Car(new CarName("woni"), new Position(3))
                , new Car(new CarName("jun"), new Position(3)));
        Cars finishedCars = CarsFactory.createFinishedCars(carList);
        List<CarName> winners = finishedCars.findWinner();

        assertThat(winners.size()).isEqualTo(2);
        assertThat(winners.get(index)).isEqualTo(new CarName(name));

    }
}
