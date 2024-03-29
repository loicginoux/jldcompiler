package mjc.tdm;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;

import mjc.tds.TDS;


public class Signature implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public final static int PUBLIC = 0;
	public final static int PRIVATE = 1;
	public final static int PROTECTED = 2;

	private int visibility;
	private boolean statique;
	List<String> params;
	String retour;
	String maclasse;
	
	
	public Signature (){
		params = new Vector<String>();
	}
	
	/**
	 * ajouter un parametre
	 * @param p type du parametre
	 */
	public void ajouter(List<String> p){
		params.addAll(p);
	}
	
	public int getVisibility() {
		return visibility;
	}
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	public boolean isStatique() {
		return statique;
	}
	public void setStatique(boolean statique) {
		this.statique = statique;
	}
	public String getRetour() {
		return retour;
	}
	public void setRetour(String retour) {
		this.retour = retour;
	}
	
	public String toString(){
		String visi;
		if(visibility==0) visi="public";
		else if(visibility==1) visi="private";
		else if(visibility==2) visi="protected";
		else visi="undefined";
		
		String stat;
		if(statique) stat="static";
		else stat="dynamic";
		
		String resParam = " ";
		
		for (String p : params){
			resParam+= p+ ",";
		}
		
		return "appart : "+maclasse+" INFO : " + visi + " " + stat + " " + retour +"\n parametre:" + resParam.substring(0, resParam.length()-1);
	}
	
	public boolean equalsBis(Object o){

		if (o instanceof Signature) {
			Signature s = (Signature) o;
			
			
			
			if(s.params.size() != this.params.size()) return false;
			else{
				
				for(int i = 0; i < params.size(); i++){
					String ss = params.get(i);
					String ss2 = s.getParams().get(i);
					
					System.out.println("ss:"+ss+ "\n");
					System.out.println("ss2:"+ss2+ "\n");
					System.out.println("\n"+ss.equals(ss2));

					if(!ss.equals(ss2)) return false;
				}
				
				return true;
				
			}
			
		}else
			return false;
		
	}

	public List<String> getParams() {
		return params;
	}

	public void setParams(List<String> params) {
		this.params = params;
	}
	
	public int size(){
		return params.size();
	}
	
	public String getStringParams() {
		List<String> list=this.params;
		
		String res = "";
		for(int i=0; i<params.size(); i++){
		res +=  list.get(i);
		}
		return res;
	}

	public String getMaclasse() {
		return maclasse;
	}

	public void setMaclasse(String maclasse) {
		this.maclasse = maclasse;
	}
	
	public Signature clone(){
		Signature s=new Signature();
		
		s.maclasse=new String(maclasse);
		if(retour!=null)
			s.retour=new String(retour);
		s.statique=statique;
		s.visibility=visibility;
		
		List<String> ls=new Vector<String>();
		for(String ss:params){
			ls.add(ss);
		}
		
		s.params = ls;
		
		return s;
	}


}
