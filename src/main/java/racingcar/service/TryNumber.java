package racingcar.service;

public class TryNumber {
    private final int tryNumber;

    public TryNumber(int tryNumber) {
        if (tryNumber < 1) {
            throw new IllegalArgumentException("최소 1회 이상 입력하세요.");
        }
        this.tryNumber = tryNumber;
    }

    public int getTryNumber() {
        return tryNumber;
    }
}
