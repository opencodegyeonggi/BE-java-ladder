package ladder;

import ladder.domain.GameAttendees;
import ladder.domain.Ladder;
import ladder.domain.LadderConfiguration;
import ladder.domain.RandomHorizontalLineStrategy;
import ladder.view.LadderInputView;
import ladder.view.LadderView;

public class Main {
    public static void main(String[] args) {
        LadderConfiguration ladderConfiguration = LadderInputView.enterLadderConfiguration();

        GameAttendees gameAttendees = new GameAttendees(ladderConfiguration.gameAttendees());
        Ladder ladder = new Ladder(gameAttendees, ladderConfiguration.ladderHeight(), new RandomHorizontalLineStrategy());

        LadderView.drawGameAttendees(gameAttendees);
        LadderView.drawLadder(ladder);
    }
}