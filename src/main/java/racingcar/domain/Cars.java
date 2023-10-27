package racingcar.domain;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
//        int differentCarNames = cars.stream().map(car -> car.getCarName()).collect(Collectors.toSet()).size();
//        if (differentCarNames != 3) {
//            throw new IllegalArgumentException("중복 이름은 허용되지 않습니다.");
//        }
        this.cars = cars;
    }

    public void race(RaceStrategy strategy) {
        cars.stream().forEach(car -> car.move(strategy));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<CarName> findWinner() {
        Position maxPosition = findMaxPosition();
        List<CarName> Winners = cars.stream()
                .filter(car -> car.getPosition().equals(maxPosition))
                .map(Car::getCarName)
                .collect(Collectors.toList());
        return Winners;
    }

    private Position findMaxPosition() {
        Position maxPosition = cars.stream()
                .map(car -> car.getPosition())
                .max(Comparator.comparing(Position::getDistance))
                .orElseThrow(NoSuchElementException::new);
        return maxPosition;
    }
}
