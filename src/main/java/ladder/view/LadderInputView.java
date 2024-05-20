package ladder.view;

import java.util.Scanner;

public record LadderInputView(
        int ladderAttendeesNumber,
        int ladderHeight
) {
    // try-with-resource 구문 추가하여 view 객체 생성 후 스캐너 반환
    public static LadderInputView enterLadderInput() {
        try(Scanner scanner = new Scanner(System.in)) {
            return new LadderInputView(enterLadderAttendeesNumber(scanner), enterLadderHeight(scanner));
        }
    }

    private static int enterLadderAttendeesNumber(Scanner scanner) {
        System.out.print("참여할 사람은 몇 명인가요? ");

        return scanner.nextInt();
    }

    private static int enterLadderHeight(Scanner scanner) {
        System.out.print("최대 사다리 높이는 몇 개 인가요? ");

        return scanner.nextInt();
    }
}
