package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class N3Exercici1 {

	public static void main(String[] args) {

		//Byte nombreAlumnes = 10;

		List<Alumne> alumnes = new ArrayList<Alumne>();
		alumnes.add(new Alumne("alex", 21, "JAVA", 6));
		alumnes.add(new Alumne("joan", 26, "SQL", 7));
		alumnes.add(new Alumne("pedro", 31, "JAVA", 5));
		alumnes.add(new Alumne("Hugo", 17, "REACT", 4));
		alumnes.add(new Alumne("Mateo", 18, "SQL", 9));
		alumnes.add(new Alumne("Martín", 23, "JAVA", 7));
		alumnes.add(new Alumne("Lucía", 28, "PHP", 6));
		alumnes.add(new Alumne("Sofía", 19, "JAVA", 4));
		alumnes.add(new Alumne("María", 41, "JAVA", 8));
		alumnes.add(new Alumne("Julia", 37, "PHP", 3));

		// System.out.println(Alumne::toString());
		alumnes.forEach(al -> System.out.println(al));

		
		System.out.println("\n\n");
		
		
		// Mostra per pantalla el nom i l’edat de cada alumne/a.
		alumnes.forEach(al -> {
			System.out.print(al.getNom() + "  ");
			System.out.println(al.getEdat());
		});
		
		System.out.println("\n\n");
		

		// Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. Assigna
		// a aquests alumnes a una altra llista i mostra per pantalla la nova llista
		// (tot amb lambdes).
		List<Alumne> alumnesResult = new ArrayList<Alumne>();

		alumnes.stream().filter(alumne -> alumne.getNom().toLowerCase().startsWith("a"))
				.forEach(al -> alumnesResult.add(al));

		alumnesResult.forEach(System.out::println);
		
		System.out.println("\n\n");

		// Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.
		alumnes.stream().filter(alumne -> alumne.getNota() >= 5).forEach(System.out::println);

		System.out.println("\n\n");
		
		// Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que
		// no són de PHP.
		alumnes.stream().filter(alumne -> alumne.getNota() >= 5 && !alumne.getCurs().equals("PHP"))
				.forEach(System.out::println);

		
		System.out.println("\n\n");
		
		
		// Mostra tots els alumnes que fan JAVA i són majors d’edat.
		alumnes.stream().filter(alumne -> alumne.getCurs().equals("JAVA") && alumne.getEdat() >= 18)
				.forEach(System.out::println);

	}

}
