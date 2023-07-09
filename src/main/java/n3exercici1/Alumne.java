package n3exercici1;

public class Alumne {
	
	private String nom;
	private int edat;
	private String curs;
	private int nota;
	
	
	
	public Alumne() {
	}

	public Alumne(String nom, int edat, String curs, int nota) {
		this.nom = nom;
		this.edat = edat;
		this.curs = curs;
		this.nota = nota;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(Byte edat) {
		this.edat = edat;
	}
	public String getCurs() {
		return curs;
	}
	public void setCurs(String curs) {
		this.curs = curs;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(Byte nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumne [nom=" + nom + ", edat=" + edat + ", curs=" + curs + ", nota=" + nota + "]";
	}
	
	
	
	

}
