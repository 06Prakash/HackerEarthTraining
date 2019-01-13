package BasicProgrammingPuzzles;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MazePuzzleEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		Scanner in = new Scanner(System.in);
		List<Character> codes = in.nextLine().trim().toLowerCase().chars().mapToObj(e -> (char) e)
				.collect(Collectors.toList());
		for (Character code : codes) {
			switch (code) {
			case 'l':
				x--;
				break;
			case 'r':
				x++;
				break;
			case 'u':
				y++;
				break;
			case 'd':
				y--;
				break;
			default:
				break;
			}
		}
		System.out.println(x + " " + y);
		in.close();
	}
}
