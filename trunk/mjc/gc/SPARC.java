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

}
