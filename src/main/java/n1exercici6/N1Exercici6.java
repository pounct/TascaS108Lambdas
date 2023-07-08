package n1exercici6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class N1Exercici6 {

	public static void main(String[] args) {
		List<String> listaNombeCadena = new ArrayList<>();
		listaNombeCadena.add("jhgjhg");
		listaNombeCadena.add("jhvfjhcv");
		listaNombeCadena.add("adfrg");
		listaNombeCadena.add("gjfvh");
		listaNombeCadena.add("lohdhjhgjhg");
		listaNombeCadena.add("jhgjhg");
		listaNombeCadena.add("jhgjhg");
		
		
		listaNombeCadena.sort(Comparator.comparing(nc->nc.toString().length()));
		listaNombeCadena.forEach(System.out::println);;

	}

}
