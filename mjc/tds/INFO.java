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

	public int getDep() {
		return dep;
	}
	public void setDep(int d){
		dep = d;
	}

	// constructeur
	public INFO( int d) {
		dep = d;
	}

	//
	// affichage
	public String toString() {
		return "; VAR : " + ", dep=" + dep;
	}
}
