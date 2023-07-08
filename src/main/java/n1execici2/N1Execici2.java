package n1execici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N1Execici2 {

	public static void main(String[] args) {

		String[] stringArray = { "okhgA", "blakBo", "Ckjhgjhg", "ojghdgfsfasD" };
		List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));

		stringList.stream()
		.filter((s) -> (s.contains("o")&& s.length()>5))
		.forEach(s -> System.out.println(s));

		

	}

}
