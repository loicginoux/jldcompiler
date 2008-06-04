package mjc.gc;

import mjc.tdm.TDM;
import mjc.tds.TDS;

public class X86 extends AbstractMachine {
	@Override
	public String genSyso(String type) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String genExprIdent(int dep, String ident) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String genReserve(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
    @Override
    public String genLoadI(String ident) {
    	return "\tLOADI (1) ;val " +ident+"\n";
    }
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
	
	public String genDefMethode(String nomMethode) {
    	return "";
    }
	
	public String genExprIdent(TDS tds, String ident) {
		return "";
    }
	
	public String genLinkage(String code, String className) {
		return "";
	}
	
	public String genStore() {
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
