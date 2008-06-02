package mjc.gc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import mjc.compiler.MJCException;
import mjc.tdm.TDM;

public abstract class AbstractMachine {
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
	
}
