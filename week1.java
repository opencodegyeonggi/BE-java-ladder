import java.util.Random;
import java.util.Scanner;

public class week1 {
    public static void main(String[] args) {

        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        //random 선언
        Random  random = new Random();

        System.out.println("참여할 사람은 몇 명인가요?");
        String scan1 = scanner.nextLine();
        int person = Integer.parseInt(scan1);

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        String scan2 = scanner.nextLine();
        int maxLadder = Integer.parseInt(scan2);

        for (int i=0; i<maxLadder; i++){
            for (int j=0; j<person; j++){
                System.out.print("|");
                if (j < person - 1) {
                    int ladderLine = random.nextInt(2);

                    if (ladderLine == 0) {
                        System.out.print("-");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
