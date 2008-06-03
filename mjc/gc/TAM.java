package mjc.gc;

import mjc.tdm.TDM;
import mjc.tds.INFO;
import mjc.tdt.TDT;


public class TAM extends AbstractMachine {
	
	public String genSyso() {
		return "\tSUBR SOut\n"; 
	}
	private static int n = 0;

	/*
	 * Pour avoir un truc un peu plus parlant qu'une etiquette
	 */
	public String genLabel(String label) {
		return label + "_" + n++;
	}
	
	/*
	 * TODO : reflechir ^^
	 */
//	public static String genDecl(String n, INFO i, int taille) {
//        return "\tPUSH " + taille + "   ; decl de " + n + " en " + i.getDep()
//          + "/SB" + " taille = " + taille + "\n";
//    }
//    
//    public static String genStore(String n, INFO i, int taille) {
//    	return "\tSTORE(" + taille + ") " + i.getDep() + "[SB]; sauvegarde\n";
//    }
//    
//    public static String genLoadIdent(String var, INFO i, int taille) {
//    	return "\tLOAD(" + taille + ") " + i.getDep() + "[SB] ; " + var + "\n";
//    }
	
    public static String genPop(int taille1, int taille2){
    	return "\tPOP(" + taille1 + ") " + taille2 + "\n";
    }
    
    public String genCond(String codeBloc1, String codeBloc2){
    	String et1 = genEtiq();
    	String res;
    	if (codeBloc2.equals("")) {
    		res = "\tJUMPIF(0) " + et1 + ";si \n" + 
    				codeBloc1 +
    				et1 + "\t;fin si\n";
    	} else {
    		String et2 = genEtiq();
    		res = "\tJUMPIF(0) " + et1 + ";si \n" + 
		        	codeBloc1 + 
		        	"\tJUMP " + et2 + "\n" + 
		        	et1 + "\t;sinon\n" + 
		        	codeBloc2 +
		        	et2 + "\t;fin si\n";
    	}
    	return res;
    }
    
    public String genWhile(String condition, String bloc) {
		String startWhile = genEtiq();
		String endWhile = genEtiq();

		return startWhile + "\n" + condition + "\t" + "JUMPIF (0) "
				+ endWhile + "\n" + bloc + "\t" + "JUMP " + startWhile + "\n"
				+ endWhile + "\n";
	}
    
    public String genReturn(String nomMethode, TDM tdm) {
    	System.out.println(nomMethode);
    	Boolean isVoid = tdm.chercherGlobalement(nomMethode).getRetour() == null;
    	int size = tdm.chercherGlobalement(nomMethode).getParams().size();
    	int sizeRet;
    	if (isVoid)
    		sizeRet = 0;
    	else
    		sizeRet = 1;
    	String res = "\t" + "RETURN (" + sizeRet + ") " + size +
    					"\t;on quitte " + nomMethode + "\n";
		return res;
	}
    
    public String genExprValeur(String f, String op) {
		return 	f +
				"\n\tLOADI (1)\t; on charge la valeur\n" +
				op;
	}
    
    public static String genLoadL(String value){
    	return "\tLOADL " + value + "\n";
    }
    
    
    public String genTrue() {
		return "\tLOADL 1\n";
	}
    
    public String genFalse() {
		return "\tLOADL 0\n";
	}
    
    public String genNull() {
		return "\tLOADL 0\n";
	}
    
    public String genInt(String i) {
		return "\tLOADL " + i + "\n";
	}
    
    public String genPlusInt() {
		return "";
	}
    
    public String genMoinsInt() {
		return "\tSUBR INeg \n";
	}
    
    public String genNegation() {
		return "\tSUBR BNeg\n";
	}
    
    public String genInf() {
		return "\tSUBR ILss\n";
	}
    
    public String genInfEg() {
		return "\tSUBR ILeq\n";
	}
    
    public String genSup() {
		return "\tSUBR IGtr\n";
	}

	public String genSupEg() {
		return "\tSUBR IGeg\n";
	}

	public String genEg() {
		return "\tSUBR Ieq\n";
	}

	public String genNEg() {
		return "\tSUBR Ieq\n";
	}
	
	public String genPlus() {
		return "\tSUBR IAdd\n";
	}

	public String genMoins() {
		return "\tSUBR ISub\n";
	}

	public String genOu() {
		return "\tSUBR BOr\n";
	}
	
	public String genMult() {
		return "\tSUBR IMul\n";
	}

	public String genDiv() {
		return "\tSUBR IDiv\n";
	}

	public String genMod() {
		return "\tSUBR IMod\n";
	}

	public String genEt() {
		return "\tSUBR BAnd\n";
	}
	
	// compteur pour le generateur d'etiquettes
    private static int cpt = 0;

    // genere une etiquette differente des autres
    public static String genEtiq() {
        return "X" + cpt++;
    }

 // genere le code pour l'arret de la machine
    public static String genFin() {
        return "\tHALT\n";
    }
    
    public String getSuffixe() {
		return "tam";
	}

}
