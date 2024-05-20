package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class LadderLine {
    private final List<Point> points;

    public LadderLine (int ladderAttendeesNumber, HorizontalLineStrategy strategy) {
        this.points = createPointsBy(ladderAttendeesNumber, strategy);
    }

    private List<Point> createPointsBy(final int ladderAttendeesNumber, final HorizontalLineStrategy strategy) {
        final List<Point> points = initPoints(ladderAttendeesNumber);

        setHorizontalLines(points, strategy);

        return points;
    }

    private List<Point> initPoints(final int ladderAttendeesNumber) {
        final List<Point> newPoints = new ArrayList<>();

        for (int i = 0; i < ladderAttendeesNumber; i++) {
            Point point = new Point(i);
            newPoints.add(point);
        }

        return newPoints;
    }

    private void setHorizontalLines(final List<Point> newPoints, final HorizontalLineStrategy strategy) {
        for (Point point : newPoints) {
            if (!isMovablePointExist(point) && isMovableIndex(point, newPoints) && strategy.isDrawLine()) {
                final Point nextPoint = getNextPoint(point, newPoints);

                point.setNextMovePoint(nextPoint);
                nextPoint.setNextMovePoint(point);
            }
        }
    }

    private boolean isMovablePointExist(final Point point) {
        // Optional 객체꺼내지 않고 확인
        return point.isNextMovePointPresent(point);
    }

    private boolean isMovableIndex(final Point point, final List<Point> newPoints) {
        final int endIndexSizeShouldExclude = 1;
        final int maximumMovableIndex = newPoints.size() - endIndexSizeShouldExclude;

        // getter 로 직접 접근하지 않고 net index 구하도록 수정
        return point.isMovableIndex(maximumMovableIndex);
    }

    private Point getNextPoint(final Point point, final List<Point> newPoints) {
        // 매직 넘버 사용을 피하기 위한 메소드 추가
        return newPoints.get(point.getNextIndex());
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        for (Point point : points) {
            stringBuilder.append(LadderCharacter.VERTICAL_LINE);
            stringBuilder.append(getPrintType(point));
        }

        return stringBuilder.toString();
    }

    private String getPrintType(final Point point) {
        return isLineLinked(point) ? LadderCharacter.HORIZONTAL_LINE : LadderCharacter.EMPTY_LINE;
    }

    private boolean isLineLinked(final Point point) {
        // Optional 객체에 맞게 수정
        return point.getNextMovePoint()
                .map(nextMovePoint -> nextMovePoint.isBiggerIndexThan(point))
                .orElse(false);
    }
}
