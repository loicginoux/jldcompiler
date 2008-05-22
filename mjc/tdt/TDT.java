package mjc.tdt;

import java.util.HashMap;

import mjc.tds.INFO;

public class TDT extends HashMap<String, INFO> {
	
	private static final long serialVersionUID = 1L;
	
	private static HashMap<String, INFO> tdt;
	
	public TDT() {
		super();
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
