package feb_17;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CharacterOccurence {
	public static void main(String[] args) {
		String str = "REATARUNRAJ";
		System.out.println(
				str.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
						.entrySet().stream().sorted((x, y) -> x.getValue().intValue() - y.getValue().intValue())
						.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue(), (oldValue, newValue) -> oldValue,
								() -> new LinkedHashMap<Character, Long>()))

		);
	}
}
