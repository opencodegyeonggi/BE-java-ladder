package ladder.domain;

import java.util.Optional;

public class Point {
    private final int index;
    private Point nextMovePoint;

    public Point(int index) {
        this.index = index;
    }

    public boolean isMovableIndex(int maximumMovableIndex) {
        return this.index < maximumMovableIndex;
    }

    public int getNextIndex() {
        final int NEXT_INDEX_OFFSET = 1;

        return this.index + NEXT_INDEX_OFFSET;
    }

    // Optional 객체로 수정
    public Optional<Point> getNextMovePoint() {
        return Optional.ofNullable(nextMovePoint);
    }

    public boolean isNextMovePointPresent(Point point) {
        return point.getNextMovePoint().isPresent();
    }

    public void setNextMovePoint(final Point nextMovePoint) {
        this.nextMovePoint = nextMovePoint;
    }

    public boolean isBiggerIndexThan(final Point point) {
        return this.index > point.index;
    }
}
