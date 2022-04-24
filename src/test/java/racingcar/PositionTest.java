package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import racingcar.domain.Position;

public class PositionTest {

    @Test
    public void create_position_test() {
        Position position = new Position(1);
        assertThat(position).isEqualTo(new Position(1));
    }

}
