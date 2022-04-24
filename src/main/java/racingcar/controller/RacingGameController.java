package racingcar.controller;

import racingcar.view.InputView;

public class RacingGameController {
    public static void startRacing() {
        String[] carNameList = InputView.enterCars();
        for (String s : carNameList) {
            System.out.println("carName = " + s);
        }

        int tryCount = InputView.enterTryCount();
        System.out.println("tryCount = " + tryCount);
    }
}
