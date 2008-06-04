package mjc.lib;

public class Affectable {

	private boolean isAffectable;
	private String adr;
	
	public Affectable(boolean b){
		isAffectable = b;
	}

	public boolean isAffectable() {
		return isAffectable;
	}

	public void setAffectable(boolean isAffectable) {
		this.isAffectable = isAffectable;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}
	
	
	
}
