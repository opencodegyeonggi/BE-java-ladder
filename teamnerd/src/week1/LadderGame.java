package week1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LadderGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String arr[] = { "ㅣ", "ㅏ", "ㅡ", "ㅓ" };
		int b = 0;
		
		System.out.print("참여할 사람은 몇 명인가요?");
		int person = scanner.nextInt();
		System.out.print("최대 사다리 높이는 몇 개인가요?");
		int height = scanner.nextInt();

		for (int h = 0; h < height; h++) {
			for (int p = 0; p < person; p++) {
				if (b == 1 && p != 0) {
					b = 3;
				} else if (p == person - 1) {
					if (b == 1) {
						b = 3;
					} else {
						b = 0;
					}
				} else {
					b = random.nextInt(2);
				}

				System.out.print(arr[b]);

				if (b == 1 && p != person - 1) {
					for (int j = 0; j < 5; j++) {
						System.out.print("─");
					}
				} else {
					for (int j = 0; j < 5; j++) {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}