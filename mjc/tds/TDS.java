package mjc.tds;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TDS extends HashMap<String, INFO> implements Serializable {

	private static final long serialVersionUID = 1L;

	private TDS parente;
	private boolean isPlusHaute;

	public TDS() {
		super();
		parente = null;
		isPlusHaute=false;
	}

	public TDS(TDS p) {
		super();
		parente = p;
		isPlusHaute=false;
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
		
		//pour avoir tout dans le bon ordre
		for(String s:keySet()){
			sb.append(s+" : "+get(s)+"\n");
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
		if (isPlusHaute)
			return this;
		else
			return parente.getPlusHaute();
	}

	public void setParente(TDS parente) {
		this.parente = parente;
	}

	public void setPlusHaute(boolean isPlusHaute) {
		this.isPlusHaute = isPlusHaute;
	}
}
