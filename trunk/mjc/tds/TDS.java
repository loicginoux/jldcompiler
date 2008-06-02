package mjc.tds;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TDS extends HashMap<String, INFO> implements Serializable {

	private static final long serialVersionUID = 1L;

	private TDS parente;

	public TDS() {
		super();
		parente = null;
	}

	public TDS(TDS p) {
		super();
		parente = p;
	}

	public INFO chercherLocalement(String n) {
		return get(n);
	}

	public INFO chercherGlobalement(String n) {
		INFO i = chercherLocalement(n);
		if (i == null)
			if (parente != null)
				return parente.chercherGlobalement(n);
		return i;
	}

	public void inserer(String n, INFO i) {
		put(n, i);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n");
		Set<Map.Entry<String, INFO>> s = entrySet();
		for (Map.Entry<String, INFO> e : s){
			sb.append("var " + e.getKey() + " : " + e.getValue() + '\n');
		
		}
		
		/*
		if(parente != null){
		sb.append("parent : ");
		sb.append(parente.toString());
		}
		*/
		
		return sb.toString();
	}

	public TDS getParente() {
		return parente;
	}
	
	public TDS getPlusHaute(){
		if (parente==null)
			return this;
		else
			return parente.getPlusHaute();
	}

	public void setParente(TDS parente) {
		this.parente = parente;
	}
}
