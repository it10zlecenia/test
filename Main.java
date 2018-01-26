package app;

public class Main {

	public static void main(String[] args) 
	{
		Pracownik pracownik = new Pracownik("Jan", "Kowalski", "00000000000", "informatyk");
		
		System.out.println("Dane pracownika: " + pracownik.toString());
	}

}
