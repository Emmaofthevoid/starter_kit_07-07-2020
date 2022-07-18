package at.campus02.pr3.beispiel1;

import java.util.List;


public class Test {
	
	public static void main(String... args) throws RechnungsLoaderException {
		List<Rechnung> rechnungsListe = RechnungsLoader.LoadAll("test.txt");
		System.out.println(rechnungsListe);


	}
}
