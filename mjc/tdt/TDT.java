package mjc.tdt;

import java.util.HashMap;

public class TDT extends HashMap<String, INFO> {
	
	private static final long serialVersionUID = 1L;
	
	private static HashMap<String, INFO> tdt;
	
	public TDT() {
		if(true) { //le fichier avec les TDT existantes n'existe pas
			tdt = new HashMap<String, INFO>();
			tdt.put("int", new INFO(1,"NULL"));
			tdt.put("boolean", new INFO(1,"NULL"));
		} else {
			//ouvrir le fichier et charger la table...
		}
	}
	
	public INFO chercher(String n) {
		return get(n);
	}
	
	public void inserer(String n, INFO i) {
		put(n, i);
	}

	public static HashMap<String, INFO> getTdt() {
		return tdt;
	}

	public static void setTdt(HashMap<String, INFO> tdt) {
		TDT.tdt = tdt;
	}
	
	public String toString() {
		String res = "";
		for(String nomClasse : tdt.keySet()) {
			res += "Class : " + nomClasse + tdt.get(nomClasse).toString();
		}
		return res;
	}
	

}
