package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class CarNameTest {

    @Test
    void 유효하지않은_CarName생성() {
        assertThatThrownBy(() -> new CarName("pobibi")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 유효한_CarName생성() {
        CarName pobi = new CarName("pobi");
        assertThat(pobi).isEqualTo(new CarName("pobi"));
    }
}
