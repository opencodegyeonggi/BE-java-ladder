package ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ladder {
    private final List<LadderLine> ladderLines;

    public Ladder(GameAttendees gameAttendees, int ladderHeight, HorizontalLineStrategy strategy) {
        this.ladderLines = createLadderLinesBy(gameAttendees, ladderHeight, strategy);
    }

    private List<LadderLine> createLadderLinesBy(GameAttendees gameAttendees, int ladderHeight, HorizontalLineStrategy strategy) {
        final List<LadderLine> ladderLines = new ArrayList<>();

        for (int i = 0; i < ladderHeight; i++) {
            ladderLines.add(new LadderLine(gameAttendees.getNumberOfGameAttendees(), strategy));
        }

        return ladderLines;
    }

    @Override
    public String toString() {
        return ladderLines.stream()
                .map((LadderLine::toString))
                .collect(Collectors.joining("\n"));
    }
}
