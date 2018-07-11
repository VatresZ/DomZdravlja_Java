
public class Lekar extends Zaposleni {
	public String specijalnost;
	public String zanimanje;
	public Lekar(String ime, String prezime) {
		super(ime, prezime);
	}

	public String punoIme() {
//		return "Dr " + super.punoIme();
		return "Dr " + ime + " " + prezime;
	}
		public String zanimanjeLekar() {
			return "lekar";
	}
		}	

