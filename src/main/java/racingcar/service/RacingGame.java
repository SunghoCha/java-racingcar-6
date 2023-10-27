package racingcar.service;

import racingcar.domain.*;

import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    private final RandomStrategy randomStrategy = new RandomStrategy();
    private final Cars cars;
    private final TryNumber tryNumber;

    public RacingGame(List<String> carNames, TryNumber tryNumber) {
        this.cars = CarsFactory.createCars(carNames);
        this.tryNumber = tryNumber;
    }

    public void start() {
        for (int i = 0; i < tryNumber.getTryNumber(); i++) {
            race(randomStrategy);
            report();
            System.out.println();
        }
        present();
    }

    private void present() {
        List<CarName> winners = cars.findWinner();
        String winner = winners.stream().map(CarName::getName).collect(Collectors.joining(","));
        System.out.println(String.format("최종 우승자 : %s", winner));
    }

    private void race(RandomStrategy randomStrategy) {
        cars.race(randomStrategy);
    }

    private void report() {
        cars.getCars()
                .stream()
                .forEach(car -> printResult(car));
    }

    private void printResult(Car car) {
        printName(car);
        printDistance(car);
    }

    private void printName(Car car) {
        System.out.print(String.format("%s : ", car.getCarName().getName()));
    }

    private void printDistance(Car car) {
        int distance = car.getPosition().getDistance();
        for (int i = 0; i < distance; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
