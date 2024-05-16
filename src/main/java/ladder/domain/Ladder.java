package ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ladder {
    private final List<LadderLine> ladderLines;

    public Ladder(int ladderAttendeesNumber, int ladderHeight, HorizontalLineStrategy strategy) {
        this.ladderLines = createLadderLinesBy(ladderAttendeesNumber, ladderHeight, strategy);
    }

    private List<LadderLine> createLadderLinesBy(int ladderAttendeesNumber, int ladderHeight, HorizontalLineStrategy strategy) {
        final List<LadderLine> ladderLines = new ArrayList<>();

        for (int i = 0; i < ladderHeight; i++) {
            ladderLines.add(new LadderLine(ladderAttendeesNumber, strategy));
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
