package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class CarsFactory {

    public static Cars createCars(List<String> carNames) {
        List<Car> carList = carNames
                .stream()
                .map(carName -> new Car(new CarName(carName), new Position(0)))
                .collect(Collectors.toList());
        return new Cars(carList);
    }

    public static Cars createFinishedCars(List<Car> carList) {
        return new Cars(carList);
    }
}
