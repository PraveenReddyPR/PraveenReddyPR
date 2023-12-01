import java.util.Scanner;

class StringcharCount {

	public  StringcharCount(String input) {
//		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
		
		for (char c = 0; c < 256; c++) {
			int count = 0;
			for (char ch : input.toLowerCase().toCharArray()) {
				if (c == ch) {
					count++;
				}
			}
			if (count >= 1 && Character.isLetterOrDigit(c)) {
				System.out.println(c + " is displaying in : " + count + " times");
			}
		}

	}
}

public class DuplicateCharCountInAString {

	public static void main(String[] args) {
		StringcharCount s = new StringcharCount("pravEen");
//		s.stringcharCount();

	}

}
