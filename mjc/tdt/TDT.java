package mjc.tdt;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;


public class TDT extends HashMap<String, Type> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//tdt parentes dues au imports
	private List<TDT> parentes;
	private String classname;


	public TDT(String nom,List<TDT> l){
		super();
		classname=nom;
		
		//type primitif
		Type integer = new Type();
		integer.setClassExtends(null);
		integer.setTaille(1);
		Type bool = new Type();
		bool.setClassExtends(null);
		bool.setTaille(1);
		
		put("int", integer);
		put("bool",bool);
		
		//type des parentes : contient le type de la classe elle meme
		for(TDT t: l){
			put(t.getClassname(),t.get(t.getClassname()));
		}
		
		
		parentes=l;
	}

	/**
	 * Chercher si la tdt connait le type
	 * @param nomType nom du type cherche
	 * @return le type ou null
	 */
	public Type chercherLocalement(String nomType){
		return get(nomType);
	}
	
	/**
	 * Chercher si la tdt ou une table parente connait le type
	 * @param nom nom du type cherche
	 * @return le type ou null
	 */
	public Type chercherGlobalement(String nom){
		if(get(nom)!=null) return get(nom);
		else{
			for(TDT t : parentes){
				Type trouve=t.chercherGlobalement(nom);
				if(trouve!=null) return trouve;
			}
		}
		return null;
	}
	
	/**
	 * Obtenir son propre type
	 * @return
	 */
	public Type getMonType(){
		return  chercherLocalement(classname);
	}
	
	public String toString() {
		String res = "TDT of "+classname+"\n";
		for(String nomClasse : this.keySet()) {
			res += "type : " + nomClasse + this.get(nomClasse)+"\n";
		}
		return res;
	}
	
	public boolean equals(Object o){
		if(o instanceof TDT){
			TDT ot = (TDT)o;
			return ot.classname.equals(classname);
		}else
			return false;
	}

	public List<TDT> getParentes() {
		return parentes;
	}

	public void setParentes(List<TDT> parentes) {
		this.parentes = parentes;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
		
		//ajouter le type de la classe et virer lancien
		remove(this.classname);
		put(classname,new Type());
	}

}
