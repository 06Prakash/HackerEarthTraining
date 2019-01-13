package BasicProgrammingPuzzles;

import java.util.Scanner;

public class BrickGame {

	public static void main(String[] args) {
		// Turn count
		int i = 1;
		// Capacity of patlu and motu
		int PatluBricks = 1;
		int MotuBricks = 2;
		Scanner in = new Scanner(System.in);
		// Total Bricks
		int N = Integer.parseInt(in.nextLine().trim());
		while (N > 0) {
			int PatluTurnBricks = PatluBricks * i;
			int MotuTurnBricks = MotuBricks * i;
			if (N > PatluTurnBricks) {
				N = N - PatluTurnBricks;
			} else {
				System.out.println("Patlu");
				break;
			}
			if (N > MotuTurnBricks) {
				N = N - MotuTurnBricks;
			} else {
				System.out.println("Motu");
				break;
			}
			i++;
		}

		in.close();
	}

}
