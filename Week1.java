import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Week1 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        int personNum = getPersonNum();
        int height = getSadariNum();

        List<Person> persons = createPersonList(personNum);
        IntStream.range(0, height).forEach( i ->
            persons.forEach( p ->
                System.out.print(p.addStairs(random))
            )
        );
    }

    private static int getPersonNum() {
        System.out.println("참여할 사람은 몇 명 인가요?");
        return scanner.nextInt();
    }

    private static int getSadariNum() {
        System.out.println("최대 사다리 높이는 몇개인가요?");
        return scanner.nextInt();
    }

    private static List<Person> createPersonList(int personNum) {
        return IntStream.range(0, personNum).mapToObj(i -> {
            if ( i == personNum - 1)
                return new Person(i+1, Boolean.TRUE);
            else
                return new Person(i+1);
        }).toList();
    }
}

class Person {
    private int personNum;
    private boolean isLast = Boolean.FALSE;

    private static final String NEED_SADARI = "|-";
    private static final String NO_NEED_SADARI = "| ";
    private static final String LAST_SADARI = "|\n";

    public Person(int personNum) {
        this.personNum = personNum;
    }

    public Person(int personNum, boolean isLast) {
        this.personNum = personNum;
        this.isLast = isLast;
    }
    public int getPersonNum() {
        return this.personNum;
    }
    public String addStairs(Random random) {
        if (isLast) {
            return LAST_SADARI;
        }

        // 0인 경우만 사다리를 만들자.. 1,2은 사다리를 만들지 않는다
        boolean isCreateSadari = random.nextInt(3) == 0;

        if (isCreateSadari) {
            return NEED_SADARI;
        } else {
            return NO_NEED_SADARI;
        }
    }
}
