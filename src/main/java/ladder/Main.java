package ladder;

import ladder.domain.Ladder;
import ladder.domain.RandomLineStrategy;
import ladder.view.LadderInputView;
import ladder.view.LadderView;

public class Main {
    public static void main(String[] args) {
        LadderInputView ladderInputView = LadderInputView.enterLadderInput();

        Ladder ladder = new Ladder(ladderInputView.ladderAttendeesNumber(), ladderInputView.ladderHeight(), new RandomLineStrategy());

        LadderView.drawLadder(ladder);
    }
}