//--------------------------------------------------
// INFO la classe representant une variable
//--------------------------------------------------
package mjc.tds;

public class INFO {
	
	public final static int PUBLIC = 0;
	public final static int PRIVATE = 1;
	public final static int PROTECTED = 2;

	// le deplacement
	private int dep;
	private int visibility;
	private boolean statique;
	private String type;


	public int getDep() {
		return dep;
	}

	public void setDep(int dep) {
		this.dep = dep;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// constructeur
	public INFO( int d) {
		dep = d;
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
		
		return "INFO : " + visi + " " + stat + " " + type + " dep : "+ dep; 
	}
}
