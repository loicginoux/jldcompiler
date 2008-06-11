package mjc.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
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
	
	public static String genLinkageTardif(String classname,AbstractMachine machine){
		TDM tdm;
		String code;
		
		tdm = chargerTDM(classname);
		List<String> l = new Vector<String>();
		for(String s : tdm.keySet()){
			
			if(!s.startsWith(classname)
				&& !tdm.get(s).isStatique()){
				l.add(classname+"_"+s);
			}
		}
		
		for(String classe : imports){
			tdm =  chargerTDM(classe);
			for(String s : tdm.keySet()){
				if(!s.startsWith(classe)
					&& !tdm.get(s).isStatique()){
					l.add(classe+"_"+s);
				}
			}
			
		}
		
		/*
		System.out.println("");
		for(String ss : l){
			System.out.println(ss);
		}
		System.out.println("");
		*/
		
		code="\t;--- appel tardif auto-generation ---\n";
		code+="auto_tardif\n";
		code+=machine.genLoad(1, -2, "LB")+
			  machine.genLoadL("\"_\"")+
			  machine.genConcat()+
			  machine.genLoad(1, -1, "LB")+
			  machine.genConcat();
		for(String ss:l){
			code +=";---"+ss+"---\n"+
					machine.genLoad(1, 3, "LB")+
					machine.genLoadL("\""+ss+"\"")+
					machine.genSCompare()+
					machine.genCond(
							machine.genLoadL("0")+ //LB
							machine.genExprIdent(ss)+
							machine.genReturn(2, 2), "");
		}
		code+=machine.genFatalError();
		code+="\t;--- fin appel tardif ---\n\n";
		
		
		return code;
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
