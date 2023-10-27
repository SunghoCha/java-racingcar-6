package racingcar.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Position;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class TryNumberTest {

    @Test
    void 유효하지않은_위치값_입력시_오류() {
        assertThatThrownBy(() -> new Position(-1)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("동등성 검사")
    void 유효한_값입력_TryMuber생성() {
        Position position = new Position(2);
        assertThat(position).isEqualTo(new Position(2));
    }
}
