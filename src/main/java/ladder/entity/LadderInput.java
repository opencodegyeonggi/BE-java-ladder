package ladder.entity;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LadderInput {
    private int personCnt;
    private int height;

    private LadderInput(int personCnt, int height) {
        this.personCnt = personCnt;
        this.height = height;
    }

    public static LadderInput of(Scanner scanner) {
        int personNum = getPersonCnt(scanner);
        int height = getLadderHeight(scanner);

        return new LadderInput(personNum, height);
    }

    private static int getPersonCnt(Scanner scanner) {
        System.out.println("참여할 사람은 몇 명 인가요?");
        return scanner.nextInt();
    }

    private static int getLadderHeight(Scanner scanner) {
        System.out.println("최대 사다리 높이는 몇개인가요?");
        return scanner.nextInt();
    }

    public List<Person> newPersonList() {
        return IntStream.range(0, personCnt)
            .mapToObj(personIndex -> {
                if ( personIndex == personCnt - 1)
                    return new Person(personIndex+1, Boolean.TRUE);
                return new Person(personIndex+1);
            }).toList();
    }

    public int getPersonCnt() {
        return personCnt;
    }

    public int getHeight() {
        return height;
    }

}
