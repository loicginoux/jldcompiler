package mjc.gc;

import mjc.tdm.TDM;

public class SPARC extends AbstractMachine {

	public String getSuffixe() {
		return "s";
	}
	
	public String genCond(String codeBloc1, String codeBloc2) {
		return "";
	}
	
	public String genWhile(String condition, String bloc) {
		return "";
	}
	
	public String genReturn(String nomMethode, TDM tdm) {
		return "";
	}
	
	public String genTrue() {
		return "";
	}
    
    public String genFalse() {
    	return "";
	}
    
    public String genNull() {
    	return "";
	}
    
    public String genInt(String i) {
    	return "";
	}
    
    public String genPlusInt() {
		return "";
	}
    
    public String genMoinsInt() {
    	return "";
	}
    
    public String genNegation() {
    	return "";
	}

}
