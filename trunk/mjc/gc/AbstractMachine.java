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

}
