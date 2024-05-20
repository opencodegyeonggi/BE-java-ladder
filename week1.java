import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class week1 {
    protected static int scanPerson(Scanner scanner) {
        System.out.println("참여할 사람은 몇 명 인가요?");
        return Integer.parseInt(scanner.nextLine());
    }
    protected static int scanLadder(Scanner scanner) {
        System.out.println("최대 사다리 높이는 몇 개 인가요?");
        return Integer.parseInt(scanner.nextLine());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random  random = new Random();

        int person = scanPerson(scanner);
        int ladder = scanLadder(scanner);

        for (int i=0; i<ladder; i++){
            for (int j=0; j<person; j++){
                System.out.print("|");
                if (j < person - 1) {
                    int ladderLine = random.nextInt(2);
                    System.out.print(ladderLine == 0 ? "-" : " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
