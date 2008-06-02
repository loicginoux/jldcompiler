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
	
	public String genExprValeur(String f, String op) {
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
    
    public String genInf() {
    	return "";
	}
    
    public String genInfEg() {
    	return "";
	}
    
    public String genSup() {
    	return "";
	}

	public String genSupEg() {
		return "";
	}

	public String genEg() {
		return "";
	}

	public String genNEg() {
		return "";
	}
	
	public String genPlus() {
		return "";
	}

	public String genMoins() {
		return "";
	}

	public String genOu() {
		return "";
	}
	
	public String genMult() {
		return "";
	}

	public String genDiv() {
		return "";
	}

	public String genMod() {
		return "";
	}

	public String genEt() {
		return "";
	}

}
