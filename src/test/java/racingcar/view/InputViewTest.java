package racingcar.view;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class InputViewTest {
    private static final String NAME_REGEX = "^([\\w]{1,5},){0,}+([\\w]{1,5})$";

    @Test
    void regex_test() {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher("pobi,woni,jun");
        assertThat(matcher.find()).isTrue();
    }
}
