package ladder.view;

import java.util.Scanner;

public record LadderInputView(
        String gameAttendees,
        int ladderHeight
) {
    public static LadderInputView enterLadderInput() {
        try(Scanner scanner = new Scanner(System.in)) {
            return new LadderInputView(enterGameAttendees(scanner), enterLadderHeight(scanner));
        }
    }
    private static String enterGameAttendees(Scanner scanner) {
        System.out.print("참여할 사람 이름을 입력 하세요. (이름은 쉼표(,)로 구분하세요.) ");

        return scanner.nextLine();
    }

    private static int enterLadderHeight(Scanner scanner) {
        System.out.print("최대 사다리 높이는 몇 개 인가요? ");

        return scanner.nextInt();
    }
}
