package n2exercici4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class N2Exercici4 {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<Object>();

		list.add("jhgjhg");
		list.add(343);
		list.add("adfrg");
		list.add("ejfvh");
		list.add("lohdhjhgjhg");
		list.add(45368);
		list.add("jhgjehg");
		list.add("123456789");

		// Alfabèticament
		//list.sort(Comparator.comparing(nc -> nc.toString()));
		//list.forEach(System.out::println);
		
		// Alfabèticament pel primer caràcter.
		System.out.println("Alfabèticament pel primer caràcter:");
		list.sort(Comparator.comparing(nc -> ((String) nc.toString()).charAt(0)));
		list.forEach(System.out::println);
		System.out.println("\n\n");
		
		// Les cadenes que contenen una "e" primer, la resta de cadenes després.
		System.out.println("cadenes que contenen una \"e\" primer:");
		list.sort(Comparator.comparing(nc -> nc.toString().contains("e")).reversed());
		list.forEach(System.out::println);
		System.out.println("\n\n");

		// Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
		System.out.println("Modifica la ‘a’ per un ‘4’:");
		list.stream().map(String::valueOf).map(nc -> nc.contains("a") ? ((String) nc).replace('a', '4') : nc.toString())
				.forEach(System.out::println);
		System.out.println("\n\n");
		
		// Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings). 
		System.out.println("elements que són numèrics:");
		list.stream()
		.filter(nc-> ((nc.toString()).matches("[0-9]+") == true))
		.forEach(System.out::println);
		System.out.println("\n\n");

		// .forEach(nc -> nc+"");

		// nc.chars().mapToObj(c -> (char) c).map(c ->
		// c=='a'?'4':c)).collect(Collectors.joining()

		//// nc.toString().contains("a") ? ((String) nc).replace(0, 0):nc.toString());
		// .map(ch-> ch='a'?'4':'a'));
		// ("a", "4") : nc.toString());

	}

}
