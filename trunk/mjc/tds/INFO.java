//--------------------------------------------------
// INFO la classe representant une variable
//--------------------------------------------------
package mjc.tds;

public class INFO {

	// le deplacement
	private int dep;

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
