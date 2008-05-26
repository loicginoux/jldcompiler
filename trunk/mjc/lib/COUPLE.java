package mjc.lib;

public class COUPLE<T1,T2> {
	private T1 gauche;
	private T2 droite;

	

	public T1 getGauche() {
		return gauche;
	}

	public void setGauche(T1 gauche) {
		this.gauche = gauche;
	}

	public T2 getDroite() {
		return droite;
	}

	public void setDroite(T2 droite) {
		this.droite = droite;
	}



	public COUPLE(T1 gauche, T2 droite) {
		super();
		this.gauche = gauche;
		this.droite = droite;
	}

	public String toString() {
		return  "<" + gauche + ", " + droite + ">";
	}
}
