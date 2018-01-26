package app;

public class Pracownik extends Osoba
{
	private String stanowisko;
	
	public Pracownik(String imie, String nazwisko, String pesel, String stanowisko)
	{
		super(imie, nazwisko, pesel);

		this.stanowisko = stanowisko;
	}

	public String getStanowisko() 
	{
		return stanowisko;
	}

	public void setStanowisko(String stanowisko)
	{
		this.stanowisko = stanowisko;
	}

	@Override
	public String toString() 
	{
		return super.toString() + " " + "Pracownik [stanowisko=" + stanowisko + "]";
	}
}
