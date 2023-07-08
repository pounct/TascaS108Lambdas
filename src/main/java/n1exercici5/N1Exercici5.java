package n1exercici5;

public class N1Exercici5 {

	public static void main(String[] args) {

		MyInterface ref;

		// lambda expression
		ref = () -> 3.1415;

		System.out.println("Value of Pi = " + ref.getPiValue());
	}

}
