package ladder.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class StringUtil {
    private static final String DIVIDER = ",";
    private static final int MAXIMUM_CHAR = 5;

    private StringUtil() {}

    public static List<String> parseStringToList(final String input) {
        return Arrays.stream(input.split(DIVIDER))
                .peek(StringUtil::isValid)
                .collect(Collectors.toList());
    }

    private static void isValid(final String input) {
        if (input.length() > MAXIMUM_CHAR) {
            throw new IllegalArgumentException("이름은 최대 5 글자 까지 입력 가능합니다.");
        }
    }

    public static String fixStringCenter(final String input) {
        if (input.length() > MAXIMUM_CHAR) throw new IllegalArgumentException("최대 5 글자 까지 입력 가능합니다.");

        int totalPadding = 5 - input.length();
        int paddingStart = totalPadding / 2;
        int paddingEnd = totalPadding - paddingStart;

        return " ".repeat(paddingStart) + input + " ".repeat(paddingEnd);
    }
}
