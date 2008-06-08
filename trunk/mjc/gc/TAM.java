package mjc.gc;

import java.util.List;

import mjc.lib.COUPLE;
import mjc.lib.Factory;
import mjc.tdm.Signature;
import mjc.tdm.TDM;
import mjc.tds.TDS;
import mjc.tdt.TDT;


public class TAM extends AbstractMachine {

	public String genSyso(String type) {
		String retligne="\tLOADL '\\n\'\n\tSUBR COut\n";
		if (type.equals("int"))
			return "\tSUBR IOut\n"+retligne; 
		else if (type.equals("bool")) //bool
			return "\tSUBR BOut\n"+retligne;
		else //string
			return "\tSUBR SOut\n"+retligne;
	}
	private static int n = 0;

	/*
	 * Pour avoir un truc un peu plus parlant qu'une etiquette
	 */
	public String genLabel(String label) {
		return label + "_" + n++;
	}

	public String genLinkage(String code, String className) {
		return "\tJUMP _start\n" + code + "_start\n"
		+ "\tCALL (LB) " + className + "_main_\n"
		+ "\tHALT\n";
	}


	public static String genPop(int taille1, int taille2){
		return "\tPOP(" + taille1 + ") " + taille2 + "\n";
	}

	public String genCond(String codeBloc1, String codeBloc2){
		String et1 = genEtiq();
		String res;
		if (codeBloc2.equals("")) {
			res = "\tJUMPIF(0) " + et1 + "\t;si\n" + 
			codeBloc1 +
			et1 + "\t\t;fin si\n";
		} else {
			String et2 = genEtiq();
			res = "\tJUMPIF(0) " + et1 + "\t\t;si\n" + 
			codeBloc1 + 
			"\tJUMP " + et2 + "\n" + 
			et1 + "\t\t;sinon\n" + 
			codeBloc2 +
			et2 + "\t\t;fin si\n";
		}
		return res;
	}

	public String genWhile(String condition, String bloc) {
		String startWhile = genEtiq();
		String endWhile = genEtiq();

		return startWhile + "\n" + condition + "\t" + "JUMPIF (0) " + endWhile + "\t;while\n"
		+ "\n" + bloc + "\t" + "JUMP " + startWhile + "\n"
		+ endWhile + "\t\t;fin while\n";
	}

	public String genReturn(String nomMethode, TDM tdm) {
		System.out.println(nomMethode);
		Boolean isVoid = tdm.chercherGlobalement(nomMethode).getRetour() == null;
		int size = tdm.chercherGlobalement(nomMethode).getParams().size();
		// XXX : reflechir au statique
		if (!tdm.chercherGlobalement(nomMethode).isStatique()) // si metode non statique, ajouter le this passé en paramètre
			size++;
		int sizeRet;
		if (isVoid)
			sizeRet = 0;
		else
			sizeRet = 1;
		String res = "\t" + "RETURN (" + sizeRet + ") " + size +
		"\t; on quitte " + nomMethode + "\n";
		return res;
	}

	public String genExprValeur(String f, String op) {
		return 	f +
		"\n\tLOADI (1)\t\t; on charge la valeur\n" +
		op;
	}


	public String genObtenirClasse(TDS tds, String classecherche) {

		if(tds.isPlusHaute()){

			if(tds.getClassname().equals(classecherche)){
				//fini
				return " ; this_pour_methode de "+classecherche+"\n";
			}else{
				//choper super (this deja passe)
				String code = genExprIdent(tds, "super");
				code += genLoadI("super");
				return code + genObtenirClasse(tds.getParente(), classecherche);
			}

		}else{
			return "\tLOADL \"FATAL ERROR\"\t; pas plus haute in genobtenirclasse\n"+
			genSyso("string");
		}
	}

	public String genExprIdent(TDS tds, String ident) {
		String code;
		if (tds.chercherGlobalement(ident).isAttribute()){ 
			if(tds.isPlusHaute()){
				if(tds.chercherLocalement(ident)!=null){
					//directement dans la bonne classe
					code = genLoadL(tds.chercherLocalement(ident).getDep()+"")+
					genPlus()+ "\t\t; @ "+ident+"\n"; ;
				}else{
					//fo choper le super
					if(tds.chercherLocalement("super")!=null){
						code = genExprIdent(tds, "super") + 
						genLoadI("super")+ //appel par valeur
						genExprIdent(tds.getParente(), ident);

					}else{
						//erreur
						code = "\tLOADL \"FATAL ERROR\"\t; pas de super in genexpr\n"+
						genSyso("string");
					}
				}
			}else{
				//pas dans une tds de classe donc charger this
				code = genExprIdent(tds, "this") + 
				genLoadI("this")+ //appel par valeur
				genExprIdent(tds.getPlusHaute(), ident);
			}
		}else{
			code = "\tLOADA " + tds.chercherGlobalement(ident).getDep() + "[LB]"
			+ "\t\t; @ "+ident+"\n"; 
		}

		return code;
	}

	public String genExprIdent(int dep, String ident) {
		return "\tLOADA " + dep + "[LB]\t\t; @ "+ident+"\n";
	}

	public String genDefMethode(String nomMethode) {
		return nomMethode + "\n";
	}


	public String genLoadL(String value){
		return "\tLOADL " + value + "\n";
	}
	@Override
	public String genLoad(int taille, int dep, String registre) {
		return "\tLOAD ("+taille+") "+dep+"["+registre+
		"]\n";
	}


	public String genTrue() {
		return "\tLOADL 1\n";
	}

	public String genFalse() {
		return "\tLOADL 0\n";
	}

	public String genNull() {
		return "\tSUBR MVoid\n";
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
		return "\tSUBR IGeq\n";
	}

	public String genEg() {
		return "\tSUBR Ieq\n";
	}

	public String genNEg() {
		return "\tSUBR INeq\n";
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

	@Override
	public String genLoadI(String ident) {
		return "\tLOADI (1)\t\t; val " +ident+"\n";
	}

	@Override
	public String genStore() {
		return "\tSTOREI(1)\n";
	}
	@Override
	public String genReserve(String nom) {
		return "\tPUSH 1\t\t\t; place de "+nom+"\n";
	}
	@Override
	public String genCall(String nom) {
		return "\tCALL (LB) "+nom+"\n";
	}
	@Override
	public String genMalloc(int taille, String nomtype) {
		String code;
		code =genLoadL(taille+"");
		code +="\tSUBR MAlloc\t\t; new "+nomtype+"\n";
		code +="\tLOAD (1) -1[ST]\t\t; reempile this \n";

		return code;

	}
	@Override
	public String genPop(int dep, int taille, String commentaire) {
		return "\tPOP ("+dep+") "+taille+"\t\t; "+commentaire+"\n";
	}

	/**
	 * Liste de methode a auto-generer
	 * auto-generation de code comme suivant : 
	 * public m(les_param) {
	 * 	[return] super.m(les_param);
	 * } 
	 */
	public String genAutoCode(List<COUPLE<String, Signature>> l,TDS tds) {
		if(l.size()>0){
			String code="\t;--- auto generation ---\n";
			String appart = tds.getParente().getClassname();
			code += "\t;--- appel aux methodes de "+appart+" ---\n\n";

			for(COUPLE<String, Signature> c:l){
				int taille = c.getDroite().size();
				int sizeret;
				if (c.getDroite().getRetour()!=null)
					sizeret=1;
				else
					sizeret=0;
				
				//generer l'etiquette
				code += ";---auto-generation methode heritee "
					+c.getGauche()+"---\n";
				code += tds.getClassname()+"_"+
						c.getGauche()+
						c.getDroite().getStringParams()+"\n";
				//load le this
				code += genExprIdent(-1-taille, "this");
				code += genLoadI("this");
				//load le super
				code += genExprIdent(tds, "super");
				code += genLoadI("super");
				//load les param
				for(int k=-c.getDroite().size();k<0;k++){
					code += genExprIdent(k, "param"+(c.getDroite().size()+k+1));
					code += genLoadI("param"+(c.getDroite().size()+k+1));
				}
				//generer l'etiquette
				code += genCall(appart+"_"+
						c.getGauche()+c.getDroite().getStringParams());
				//generer le return
				code += "\t" + "RETURN (" + sizeret + ") " 
						+ (c.getDroite().size()+1) +"\n";
				code += ";---fin methode heritee "
					+c.getGauche()+"---\n\n";
			}

			return code;
		}else
			return "";
	}

}
