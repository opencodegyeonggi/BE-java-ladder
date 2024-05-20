package ladder.view;

import ladder.domain.Ladder;

public class LadderView {

    private LadderView() {}

    public static void drawLadder(final Ladder ladder) {
        System.out.println();
        System.out.println(ladder);
    }
}
