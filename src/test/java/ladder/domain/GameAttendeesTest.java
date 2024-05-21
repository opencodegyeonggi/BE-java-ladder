package ladder.domain;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameAttendeesTest {
    GameAttendees gameAttendees = new GameAttendees("hello,world,test");

    @Test
    @DisplayName("게임 참석자의 수가 실제 입력과 같은지 확인")
    void isNumberOfAttendeesSizeEqualWithInput() {
        int actual = gameAttendees.getNumberOfGameAttendees();

        assertThat(actual).isEqualTo(3);
    }
}