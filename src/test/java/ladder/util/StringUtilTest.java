package ladder.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class StringUtilTest {

    @ParameterizedTest
    @DisplayName("참가자 이름의 글자 수가 범위를 넘으면 실패")
    @ValueSource(strings = {"abcdef", "123456", "helloWorld"})
    void failIfInputSizeBiggerThanBoundary(String input) {
        assertThatThrownBy(() -> StringUtil.parseStringToList(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @DisplayName("입력 문자열이 길이 5 이하일 때 길이가 5인 가운데 정렬된 문자열을 반환해야 함")
    @CsvSource({
            "'', '     '",
            "'a', '  a  '",
            "'ab', ' ab  '",
            "'abc', ' abc '",
            "'abcd', 'abcd '",
            "'abcde', 'abcde'"
    })
    void fixStringCenterWithValidInput(String input, String expected) {
        int totalLength = 5;
        String result = StringUtil.fixStringCenter(input);

        assertAll(
                () -> assertThat(result.length()).isEqualTo(totalLength),
                () -> assertThat(result).isEqualTo(expected)
        );
    }

    @ParameterizedTest
    @DisplayName("입력 문자열이 길이 6 이상일 때 예외가 발생해야 함")
    @ValueSource(strings = {"abcdef"})
    void fixStringCenterWithInvalidInput(String input) {
        assertThatThrownBy(() -> StringUtil.fixStringCenter(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("최대 5 글자 까지 입력 가능합니다.");
    }
}