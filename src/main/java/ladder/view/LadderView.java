package ladder.view;

import ladder.domain.GameAttendees;
import ladder.domain.Ladder;

public class LadderView {

    private LadderView() {}

    public static void drawGameAttendees(final GameAttendees gameAttendees) {
        System.out.println();
        System.out.println(gameAttendees);
    }

    public static void drawLadder(final Ladder ladder) {
        System.out.println(ladder);
    }
}
