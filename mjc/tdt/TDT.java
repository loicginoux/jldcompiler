package mjc.tdt;

import java.util.HashMap;

public class TDT extends HashMap<String, INFO> {
	
	private static final long serialVersionUID = 1L;
	
	public TDT() {
		super();
		put("int", new INFO(1,"NULL"));
		put("boolean", new INFO(1,"NULL"));
	}
	
	public INFO chercher(String n) {
		return get(n);
	}
	
	public void inserer(String n, INFO i) {
		put(n, i);
	}

	public INFO getInfo(String nom) {
		return get(nom);
	}
	
	public String toString() {
		String res = "";
		for(String nomClasse : this.keySet()) {
			res += "Class : " + nomClasse + this.get(nomClasse).toString();
		}
		return res;
	}
	

}
