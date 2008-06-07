package mjc.tdm;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import mjc.lib.COUPLE;

public class TDM extends HashMap<String, Signature> implements Serializable {

		private static final long serialVersionUID = 1L;

		private TDM parente;
		private String classname;

		public TDM() {
			super();
			parente = null;
		}

		public TDM(TDM p) {
			super();
			parente = p;
		}
		
		
		public List<Signature> chercherLocalementSansArgs(String n){
			List<Signature> l = new Vector<Signature>();
			
			Set<String> keys = this.keySet();
			for(String key:keys){
				String compare = key.split("_")[0];
				if (compare.equals(n))
					l.add(this.get(key));
					
			}
			
			return l;
		}
		
		public List<Signature> chercherGlobalementSansArgs(String n){
			List<Signature> i = chercherLocalementSansArgs(n);
			if (i.isEmpty())
				if (parente != null)
					return parente.chercherGlobalementSansArgs(n);
			return i;
		}

		public Signature chercherLocalement(String n) {
			return get(n);
		}
		

		public Signature chercherGlobalement(String n) {
			Signature i = chercherLocalement(n);
			if (i == null)
				if (parente != null)
					return parente.chercherGlobalement(n);
			return i;
		}

		public void inserer(String n, Signature i) {
			put(n, i);
		}

		public String toString() {
			StringBuffer sb = new StringBuffer();
			sb.append("\n");
			Set<Map.Entry<String, Signature>> s = entrySet();
			for (Map.Entry<String, Signature> e : s){
				sb.append("methode " + e.getKey() + " : " + e.getValue() + '\n');
			
			}
			
			if(parente != null){
			sb.append("parent : ");
			sb.append(parente.toString());
			}
			
			return sb.toString();
		}

		public TDM getParente() {
			return parente;
		}

		public void setParente(TDM parente) {
			this.parente = parente;
		}

		public String getClassname() {
			return classname;
		}

		public void setClassname(String classname) {
			this.classname = classname;
		}
		
		/**
		 * Insere dans la table des methodes courantes
		 * toutes les méthodes qui sont heritees et qui n'ont pas
		 * ete redefinies pour la classe suivante
		 * 
		 */
		public List<COUPLE<String, Signature>> autoHeritage(){
			if(getParente()==null){
				return new Vector<COUPLE<String, Signature>>();
			}
			else{
				List<COUPLE<String, Signature>> ret = 
					new Vector<COUPLE<String, Signature>>();
				List<String> setp = new Vector<String>();
				
				//recup tout le monde sauf
				//le constructeur et les statiques
				for(String ss:parente.keySet()){
					if(!ss.startsWith(parente.getClassname()) 
							&& !parente.get(ss).isStatique()
							&& (parente.get(ss).getVisibility()!=Signature.PRIVATE) ){
						setp.add(ss);
					}
				}

				for(String ss:setp){
					if(!containsKey(ss)){
						System.out.println("auto-ajout : "+ss);
						Signature clonesig = parente.get(ss).clone();
						clonesig.setMaclasse(getClassname());
						ret.add(new COUPLE<String, Signature>(ss,clonesig));
						this.put(ss,clonesig);
					}
				}
				
				return ret;
				
			}
		}


}
