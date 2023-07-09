package n2exercici3;

public class N2Exercici3 {

	public static void main(String[] args) {

		Ioperacio suma = (a,b)-> a+b;
		System.out.println(suma.operacio(10, 20));
		
		Ioperacio resta = (a,b)-> a-b;
		System.out.println(resta.operacio(10, 20));
		
		Ioperacio multiplicacio  = (a,b)-> a*b;
		System.out.println(multiplicacio.operacio(10, 20));
		
		Ioperacio divisio = (a,b)-> a/b;
		System.out.println(divisio.operacio(10, 20));
			
			
			
		}

}
