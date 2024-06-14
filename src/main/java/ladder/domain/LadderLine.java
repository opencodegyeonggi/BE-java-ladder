package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class LadderLine {
    private final List<Point> points;

    private static final int LADDER_PADDING = 2;
    private static final int LADDER_EXTENSION = 5;

    public LadderLine (int numberOfGameAttendees, HorizontalLineStrategy strategy) {
        this.points = createPointsBy(numberOfGameAttendees, strategy);
    }

    private List<Point> createPointsBy(final int numberOfGameAttendees, final HorizontalLineStrategy strategy) {
        final List<Point> points = initPoints(numberOfGameAttendees);

        setHorizontalLines(points, strategy);

        return points;
    }

    private List<Point> initPoints(final int numberOfGameAttendees) {
        final List<Point> newPoints = new ArrayList<>();

        for (int i = 0; i < numberOfGameAttendees; i++) {
            Point point = new Point(i);
            newPoints.add(point);
        }

        return newPoints;
    }

    private void setHorizontalLines(final List<Point> newPoints, final HorizontalLineStrategy strategy) {
        for (Point point : newPoints) {
            if (!isMovablePointExist(point) && isMovableIndex(point, newPoints) && strategy.isDrawLine()) {
                final Point nextPoint = getNextPoint(point, newPoints);

                point.assignNextMovePoint(nextPoint);
                nextPoint.assignNextMovePoint(point);
            }
        }
    }

    private boolean isMovablePointExist(final Point point) {
        return point.isNextMovePointPresent(point);
    }

    private boolean isMovableIndex(final Point point, final List<Point> newPoints) {
        final int endIndexSizeShouldExclude = 1;
        final int maximumMovableIndex = newPoints.size() - endIndexSizeShouldExclude;

        return point.isMovableIndex(maximumMovableIndex);
    }

    private Point getNextPoint(final Point point, final List<Point> newPoints) {
        return newPoints.get(point.getNextIndex());
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ".repeat(LADDER_PADDING));

        for (Point point : points) {
            stringBuilder.append(LadderCharacter.VERTICAL_LINE);
            stringBuilder.append(getPrintType(point).repeat(LADDER_EXTENSION));
        }

        return stringBuilder.toString();
    }

    private String getPrintType(final Point point) {
        return isLineLinked(point) ? LadderCharacter.HORIZONTAL_LINE : LadderCharacter.EMPTY_LINE;
    }

    private boolean isLineLinked(final Point point) {
        return point.getNextMovePoint()
                .map(nextMovePoint -> nextMovePoint.isBiggerIndexThan(point))
                .orElse(false);
    }
}
