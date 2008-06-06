package mjc.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

import mjc.gc.AbstractMachine;
import mjc.tdm.TDM;
import mjc.tds.TDS;
import mjc.tdt.TDT;

public class Factory {
	
	private static String langage;
	private static Vector<String> imports;

	public static void persister(Serializable t,String filename){
		try{
			FileOutputStream fos = new FileOutputStream(new File(filename));
			ObjectOutputStream oos =  new ObjectOutputStream(fos);
			oos.writeObject(t);
			
			oos.close();
			fos.close();
		}catch(Exception e){
			throw new RuntimeException("Impossible de persister la TDT : "+e);
		}
	}
	
	public static String chargerCode(String className) {
		String filename = className + "." + langage;
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream(new File(filename));
			ois = new ObjectInputStream(fis);
			String ret = (String) ois.readObject();
			ois.close();
			fis.close();
			return ret;
		} catch (FileNotFoundException e) {
			return null;
		} catch (Exception e) {
			throw new RuntimeException("Impossible de charger le code : "+e);
		}
	}
	
	public static TDT chargerTDT(String classname){
		String filename=classname+".tdt";
		ObjectInputStream ois=null;
		try {
			FileInputStream fis = new FileInputStream(new File(filename));
			ois = new ObjectInputStream(fis);
			TDT ret = (TDT) ois.readObject();
			ois.close();
			fis.close();
			//System.out.println("class"+classname+"ret"+ret);
			return ret;
		} catch (FileNotFoundException e) {
			return null;
		} catch (Exception e) {
			throw new RuntimeException("Impossible de charger la TDT : "+e);
		}
	}
	
	public static TDS chargerTDS(String classname){
		String filename=classname+".tds";
		try {
			FileInputStream fis = new FileInputStream(new File(filename));
			ObjectInputStream ois = new ObjectInputStream(fis);
			TDS ret = (TDS) ois.readObject();
			ois.close();
			fis.close();
			return ret;
		} catch (FileNotFoundException e) {
			return null;
		} catch (Exception e) {
			throw new RuntimeException("Impossible de charger la TDS : "+e);
		}
	}
	
	public static TDM chargerTDM(String classname){
		String filename=classname+".tdm";
		try {
			FileInputStream fis = new FileInputStream(new File(filename));
			ObjectInputStream ois = new ObjectInputStream(fis);
			TDM ret = (TDM) ois.readObject();
			ois.close();
			fis.close();
			return ret;
		} catch (FileNotFoundException e) {
			return null;
		} catch (Exception e) {
			throw new RuntimeException("Impossible de charger la TDS : "+e);
		}
	}
	
	public static String genLinkageImports(TDT tdt, AbstractMachine machine) {
		imports = new Vector<String>();
		getClassImported(tdt);
		imports.remove(tdt.getClassname());
		String res = "";
		for (String classToImport : imports) {
			res += chargerCode(classToImport + "_code");
		}
		return "\t\t; imports\n" + res + "\t\t; fin imports\n\n";
	}
	
	private static void getClassImported(TDT tdt) {
		if (!imports.contains(tdt.getClassname()))
			imports.add(tdt.getClassname());
		if (tdt.getParentes() != null) {
			for (TDT t : tdt.getParentes()) {
				getClassImported(t);
			}
		}
	}
	
	public static boolean isNull(Object o){
		return o==null;
	}
	
	public static void setLangage(String l) {
		langage = l;
	}

}
