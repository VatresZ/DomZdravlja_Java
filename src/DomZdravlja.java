import java.util.Scanner;

public class DomZdravlja {
	static Scanner sc = new Scanner(System.in);

	static void ispisiIme(Zaposleni z) {
		System.out.println(z.punoIme());
	}

	static void ispisiSpecijalnost(Lekar z) {
		System.out.println(z.specijalnost);
	}

	static void ispisiZanimanje(Zaposleni z) {
		System.out.println(z.zanimanje);
	}
	static void ispisiZanimanje(Lekar z) {
		System.out.println(z.zanimanje);
	}

	// Za dom zdravlja dodate metod `zanimanje` koji za lekare vraæa string "lekar"
	// a za ostale zaposlene "nepoznato".
	// Ovo treba da bude metod koji se može pozvati iz glavnog programa bez znanja
	// unapred da li je nekad objekat lekar ili nije.

	public static void main(String args[]) {
		Zaposleni pera = new Zaposleni("Pera", "Petrovic");
		pera.telefon = "0631725588";
//		pera.zanimanje = "nepoznato";
		Lekar jana = new Lekar("Jana", "Jankovic");
		jana.specijalnost = "ortoped";
		jana.telefon = "0111234556";
//		jana.zanimanje = "lekar";

		System.out.println(pera.zapisZaImenik());
		System.out.println(jana.zapisZaImenik());
		System.out.println(jana.punoIme());
		System.out.println("Zanimanje za zaposlenog " + pera.punoIme() + " je : " + pera.zanimanjeZaposleni());
		System.out.println("Zanimanje za zaposlenog " + jana.punoIme() + " je : " + jana.zanimanjeLekar());

	}

}
