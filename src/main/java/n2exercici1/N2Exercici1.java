package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N2Exercici1 {

	public static void main(String[] args) {
		String[] stringArray = { "Aba", "Abraham", "Bernat", "Maria" };
		List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));

		stringList
		.stream()
		.filter((s) -> (s.startsWith("A")&&s.length()==3))
		.forEach(s -> System.out.println(s));
	}

}
