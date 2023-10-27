package racingcar.domain;

import java.util.Objects;

public class Position {
    private int Position;

    public Position(int position) {
        if (position < 0) {
            throw new IllegalArgumentException();
        }
        this.Position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Position == position.Position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Position);
    }
}
