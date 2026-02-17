package feb_17;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String str = "REALTARUNRAJ";
		Set<Character> alreadyPresent = new HashSet<Character>();
		Set<Character> duplicate = new HashSet<Character>();

		for (char ch : str.toCharArray()) {
			if (alreadyPresent.contains(ch)) {
				duplicate.add(ch);
			} else {
				alreadyPresent.add(ch);
			}
		}

		System.out.println(duplicate);
	}
}
