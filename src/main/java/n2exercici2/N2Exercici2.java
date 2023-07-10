package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N2Exercici2 {

	public static void main(String[] args) {

		List<Integer> llistaIntegers = new ArrayList<>(Arrays.asList(3, 55, 44));

		////// with FunctionalInterface
		MiInterface ref;
		
		ref = (i) -> 0 == (i % 2) ? "o" + i : "e" + i;

		llistaIntegers.stream().forEach((i) -> {
			System.out.println(ref.ConcatValue(i));
		});
		
		//// without
		llistaIntegers.stream().map(i -> 0 == (i % 2) ? "o" + i : "e" + i).forEach(System.out::println);
		

	}

}
