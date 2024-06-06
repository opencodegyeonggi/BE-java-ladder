import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class week1 {

    // 사용자로부터 참여할 사람 수를 입력받는 메서드
    private static int scanPerson(Scanner scanner) {
        System.out.print("참여할 사람은 몇 명 인가요? : ");
        return Integer.parseInt(scanner.nextLine());
    }

    // 사용자로부터 사다리의 최대 높이를 입력받는 메서드
    private static int scanLadder(Scanner scanner) {
        System.out.print("최대 사다리 높이는 몇 개 인가요? : ");
        return Integer.parseInt(scanner.nextLine());
    }

    // 사다리의 한 줄을 생성하는 메서드
    private static String generateLadderLine(int person, Random ran) {
        return IntStream.range(0, person)
                .mapToObj(j -> "|" + (j < person - 1 ? (ran.nextInt(2) == 0 ? "-" : " ") : ""))
                .collect(Collectors.joining());
    }

    // 전체 사다리를 생성하는 메서드
    private static void generateLadder(int person, int ladder, Random ran) {
        IntStream.range(0, ladder)
                .mapToObj(i -> generateLadderLine(person, ran))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random  random = new Random();

        // 사용자로부터 입력받기
        int person = scanPerson(scanner);
        int ladder = scanLadder(scanner);

        //사다리 생성
        generateLadder(person, ladder, random);

        // 스캐너 자원 해제
        scanner.close();
    }
}