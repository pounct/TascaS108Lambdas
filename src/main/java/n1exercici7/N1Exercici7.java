package n1exercici7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class N1Exercici7 {

	public static void main(String[] args) {


		List<Object> listaNombeCadena = new ArrayList<>();
		listaNombeCadena.add("jhgjhg");
		listaNombeCadena.add(343);
		listaNombeCadena.add("adfrg");
		listaNombeCadena.add("gjfvh");
		listaNombeCadena.add("lohdhjhgjhg");
		listaNombeCadena.add(45368);
		listaNombeCadena.add("jhgjbbhg");
		
		
		listaNombeCadena.sort(Comparator.comparing(nc->nc.toString().length()));
		listaNombeCadena.forEach(System.out::println);
		
		listaNombeCadena.sort(Comparator.comparing(nc->nc.toString().length()).reversed());
		listaNombeCadena.forEach(System.out::println);
	}

}
