package ladder.view;

import ladder.domain.LadderConfiguration;

import java.util.Scanner;

public class LadderInputView {
    public static LadderConfiguration enterLadderConfiguration() {
        try(Scanner scanner = new Scanner(System.in)) {
            return new LadderConfiguration(enterGameAttendees(scanner), enterLadderHeight(scanner));
        }
    }

    private static String enterGameAttendees(Scanner scanner) {
        System.out.print("참여할 사람 이름을 입력 하세요. (이름은 쉼표(,)로 구분하세요.) ");

        return scanner.nextLine();
    }

    private static int enterLadderHeight(Scanner scanner) {
        int ladderHeight;

        while (true) {
            System.out.print("최대 사다리 높이는 몇 개인가요?: ");

            try {
                ladderHeight = Integer.parseInt(scanner.nextLine().trim());

                if (ladderHeight > 0) {
                    return ladderHeight;
                } else {
                    System.out.println("양의 정수를 입력하세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("유효한 양의 정수를 입력하세요.");
            }
        }
    }
}
