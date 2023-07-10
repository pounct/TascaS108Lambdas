package n1execici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N1Execici1 {

	public static void main(String[] args) {

		String[] stringArray = { "A", "Bo", "C", "oD" };
		List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));

		stringList.stream()
		.filter((s) -> (s.contains("o")))
		.forEach(s -> System.out.println(s));

	}

}
