
public class Zaposleni {

	public String ime, prezime;
	public String telefon;
	public String zanimanje;

	public Zaposleni(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		telefon = new String();
		zanimanje = new String();
	}

	public String punoIme() {
		return ime + " " + prezime;
	}

	public String zapisZaImenik() {
		return punoIme() + " :  " + telefon;
	}


	public String zanimanjeZaposleni() {
//			return null;
			return "nepoznato";
	}
}
