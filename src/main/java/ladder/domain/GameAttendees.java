package ladder.domain;

import ladder.util.StringUtil;

import java.util.List;

public class GameAttendees {
    private final List<String> gameAttendees;

    public GameAttendees(String stringGameAttendees) {
        this.gameAttendees = StringUtil.parseStringToList(stringGameAttendees);
    }

    public int getNumberOfGameAttendees() {
        return gameAttendees.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        gameAttendees.forEach(attendee -> {
            stringBuilder.append(StringUtil.fixStringCenter(attendee));
            stringBuilder.append(" ");
        });

        return stringBuilder.toString();
    }
}
