package mjc.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import mjc.tds.TDS;
import mjc.tdt.TDT;

public class Factory {

	public static void persister(Serializable t,String filename){
		try{
			FileOutputStream fos = new FileOutputStream(new File(filename));
			ObjectOutputStream oos =  new ObjectOutputStream(fos);
			oos.writeObject(t);
		}catch(Exception e){
			throw new RuntimeException("Impossible de persister la TDT : "+e);
		}
	}
	
	public static TDT chargerTDT(String classname){
		String filename=classname+".tdt";
		try {
			FileInputStream fis = new FileInputStream(new File(filename));
			ObjectInputStream ois = new ObjectInputStream(fis);
			TDT ret = (TDT) ois.readObject();
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
			return (TDS) ois.readObject();
		} catch (FileNotFoundException e) {
			return null;
		} catch (Exception e) {
			throw new RuntimeException("Impossible de charger la TDS : "+e);
		}
	}
	
	public static boolean isNull(Object o){
		return o==null;
	}

}
