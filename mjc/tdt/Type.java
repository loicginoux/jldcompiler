package mjc.tdt;

import java.io.Serializable;

/**
 * Represente un type primitif ou un type class
 * @author jnoleau
 *
 */
public class Type implements Serializable{
	private int taille;
	private String classExtends;
	
	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public String getClassExtends() {
		return classExtends;
	}

	public void setClassExtends(String classExtends) {
		this.classExtends = classExtends;
	}

	public Type() {
		super();
	}
	
	public String toString(){
		return " ("+taille+","+classExtends+")";
	}

}
