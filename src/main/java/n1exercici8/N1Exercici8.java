package n1exercici8;


public class N1Exercici8 {
	public static void main(String[] args) {
		MyInterface ref;
		String origin="jhgjhg56fghññ33";
		
		
		
		ref = (str) -> str.chars()
				.mapToObj(c -> (char)c)
				.reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
		
		System.out.println("El reverse de : "+origin+" es :" + ref.reverse(origin));

	}

}
