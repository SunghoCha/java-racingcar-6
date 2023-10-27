package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.service.TryNumber;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InputView {
    private static final String NAME_REGEX = "^([\\w]{1,5})+(,[\\w]{1,5}){0,}";
    private static final String NUMBER_REGEX = "^[\\d]";
    

    public static List<String> takeCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String value = Console.readLine();
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(value);
        if (!matcher.find()) {
            throw new IllegalArgumentException();
        }
        String[] values = value.trim().split(",");
        List<String> carNames = Arrays.stream(values).collect(Collectors.toList());
        return carNames;
    }

    public static TryNumber takeTryNumber() {
        System.out.println("시도할 회수는 몇회인가요?");
        String value = Console.readLine();
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(value);
        if (!matcher.find()) {
            throw new IllegalArgumentException();
        }
        int tryNumber = Integer.parseInt(value);
        return new TryNumber(tryNumber);
    }
}
