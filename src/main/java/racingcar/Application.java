package racingcar;

import racingcar.service.RacingGame;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        RacingGame racingGame = new RacingGame(InputView.takeCarName(), InputView.takeTryNumber());
        racingGame.start();
    }

}
