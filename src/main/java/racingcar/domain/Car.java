package racingcar.domain;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final CarName carName;
    private Position position;

    public Car(CarName carName, Position position) {
        this.carName = carName;
        this.position = position;
    }

    public CarName getCarName() {
        return carName;
    }

    public Position getPosition() {
        return position;
    }

    public void move() {
        if (Randoms.pickNumberInRange(0, 9) >= 4) {
            this.position = new Position(position.getDistance() + 1);
        }
    }
}
