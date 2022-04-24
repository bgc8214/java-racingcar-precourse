package racingcar;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import racingcar.domain.GameManager;

public class GameManagerTest {

    @Test
    public void make_racing_cars_test() {
        String[] racingCars = {"aaaa", "bbbb", "cccc", "dddd"};
        GameManager gameManager = new GameManager(racingCars);
        assertThat(gameManager.getCarList().size()).isEqualTo(4);
    }
}
