package mjc.tdm;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

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


}
