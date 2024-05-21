package ladder;

import ladder.domain.GameAttendees;
import ladder.domain.Ladder;
import ladder.domain.RandomLineStrategy;
import ladder.view.LadderInputView;
import ladder.view.LadderView;

public class Main {
    public static void main(String[] args) {
        LadderInputView ladderInputView = LadderInputView.enterLadderInput();

        GameAttendees gameAttendees = new GameAttendees(ladderInputView.gameAttendees());
        Ladder ladder = new Ladder(gameAttendees, ladderInputView.ladderHeight(), new RandomLineStrategy());

        LadderView.drawGameAttendees(gameAttendees);
        LadderView.drawLadder(ladder);
    }
}