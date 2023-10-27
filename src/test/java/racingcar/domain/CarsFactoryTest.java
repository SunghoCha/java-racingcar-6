package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsFactoryTest {

    @ParameterizedTest
    @CsvSource({"0,pobi", "1,woni", "2,jun"})
    void Cars_생성테스트(int index, String carName) {
        List<String> carNames = Arrays.asList("pobi", "woni", "jun");
        Cars cars = CarsFactory.createCars(carNames);
        assertThat(cars.getCars().get(index).getCarName().getName()).isEqualTo(carName);
    }

    @ParameterizedTest
    @CsvSource({"0,2", "1,3", "2,3"})
    @DisplayName("경주 완료 상태인 Cars 생성")
    void FinishedCar_생성테스트(int index, int distance) {
        List<Car> carList = Arrays.asList(new Car(new CarName("pobi"), new Position(2))
                , new Car(new CarName("woni"), new Position(3))
                , new Car(new CarName("jun"), new Position(3)));
        Cars finishedCars = CarsFactory.createFinishedCars(carList);
        assertThat(finishedCars.getCars().get(index).getPosition()).isEqualTo(new Position(distance));
    }
}
