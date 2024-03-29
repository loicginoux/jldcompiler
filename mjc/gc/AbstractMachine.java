package mjc.gc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;

import mjc.compiler.MJCException;
import mjc.lib.COUPLE;
import mjc.tdm.Signature;
import mjc.tdm.TDM;
import mjc.tds.TDS;

public abstract class AbstractMachine {
	protected String classname;
	public abstract String getSuffixe();

	public void writeCode(String fname, String code) throws MJCException {
		try {
			String asmName = fname + "." + getSuffixe();
			System.err.println("Ecriture du code dans " + asmName);
			PrintWriter pw = new PrintWriter(new FileOutputStream(asmName));
			pw.print(code);
			pw.close();
		} catch (FileNotFoundException e) {
			throw new MJCException(e.getMessage());
		}
	}
	
	public abstract String genCond(String codeBloc1, String codeBloc2);
	public abstract String genWhile(String condition, String bloc);
	public abstract String genReturn(String nomMethode, TDM tdm);
	public abstract String genReturn(int n,int d);
	public abstract String genDefMethode(String nomMethode);
	public abstract String genExprIdent(TDS tds, String ident);
	public abstract String genExprIdent(int dep, String ident);
	public abstract String genExprIdent(String etiquette);
	public abstract String genLinkage(String code, String className);
	public abstract String genTrue();
    public abstract String genFalse();
    public abstract String genNull();
    public abstract String genInt(String i);
    public abstract String genPlusInt();
    public abstract String genMoinsInt();
    public abstract String genNegation();
    public abstract String genInf();
    public abstract String genInfEg();
    public abstract String genSup();
	public abstract String genSupEg();
	public abstract String genEg();
	public abstract String genNEg();
	public abstract String genPlus();
	public abstract String genMoins();
	public abstract String genOu();
	public abstract String genMult();
	public abstract String genDiv();
	public abstract String genMod();
	public abstract String genEt();
	public abstract String genExprValeur(String f, String op);
	public abstract String genSyso(String type);
	public abstract String genStore();
	public abstract String genLoadI(String s);
	public abstract String genReserve(String nom);
	public abstract String genCall(String nom);
	public abstract String genCallI();
	public abstract String genMalloc(int taille,String nomtype);
	public abstract String genLoadL(String value);
	public abstract String genLoad(int taille,int dep,String registre);
	public abstract String genPop(int dep,int taille,String commentaire);
	public abstract String genObtenirClasse(TDS tds,String classecherche);
	public abstract String genAutoCode(List<COUPLE<String, Signature>> l,TDS tds);
	public abstract String genConcat();
	public abstract String genSCompare();
	public abstract String genFatalError();

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}
	
}
