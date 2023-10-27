package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class PositionTest {

    @Test
    void 유효하지않은_위치값_입력시_오류() {
        assertThatThrownBy(() -> new Position(-1)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("동등성 검사")
    void 유효한_값입력_Position생성() {
        Position position = new Position(2);
        assertThat(position).isEqualTo(new Position(2));
    }
}
