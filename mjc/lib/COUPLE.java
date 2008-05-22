package mjc.lib;

public class COUPLE {
	private int gauche;
	private boolean droite;

	

	public int getGauche() {
		return gauche;
	}

	public void setGauche(int gauche) {
		this.gauche = gauche;
	}

	public boolean getDroite() {
		return droite;
	}

	public void setDroite(boolean droite) {
		this.droite = droite;
	}



	public COUPLE(int gauche, boolean droite) {
		super();
		this.gauche = gauche;
		this.droite = droite;
	}

	public String toString() {
		return  "<" + gauche + ", " + droite + ">";
	}
}
