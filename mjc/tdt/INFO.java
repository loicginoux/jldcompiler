//--------------------------------------------------
// INFO la classe representant une variable
//--------------------------------------------------
package mjc.tdt;

import java.util.HashMap;

public class INFO {

	private int taille;
	private String extention;
	private HashMap<String, String> listeChamps;

	public INFO() {
		listeChamps = new HashMap<String, String>();
	}
	
	public INFO(int taille, String extention) {
		this.taille = taille;
		this.extention = extention;
		listeChamps = new HashMap<String, String>();
	}
	
	public int getTaille() {
		return taille;
	}
	public void setTaille(int t){
		taille = t;
	}

	public String getExtention() {
		return extention;
	}

	public void setExtention(String extention) {
		this.extention = extention;
	}

	public HashMap<String, String> getListeChamps() {
		return listeChamps;
	}

	public void addChamps(String nom, String type) {
		this.listeChamps.put(nom, type);
	}

	// affichage
	public String toString() {
		String res = " extends : " + extention + "\n";
		res += "taille : " + taille + "\nChamps :\n";
		for(String id : listeChamps.keySet()) {
			res += "\t<" + id + ", " + listeChamps.get(id) + ">\n";
		}
		return res;
	}
}
