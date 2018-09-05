package com.flafitte.exercices.quanta;

import java.util.List;
import java.util.Vector;
import com.flafitte.exercices.quanta.Quark.*;


public class MainClass {

	public static void main(String[] args) throws Exception {
		List<Quark> lQuark=new Vector<Quark>() ;
		Up qUp= new Up();
		Down qDown= new Down();
		Top qTop= new Top();
		Bottom qBottom=new Bottom();
		Strange qStrange= new Strange();
		Charm qCharm=new Charm();
		
		lQuark.add(qUp);
		lQuark.add(qDown);
		lQuark.add(qTop);
		lQuark.add(qBottom);
		lQuark.add(qStrange);
		lQuark.add(qCharm);
		
		for (int i=0; i< lQuark.size(); i++ ) {
			printOutProperties(lQuark.get(i));
		}
	}
	
	// Get treepath of object
	private static String getObjectPath(Object obj) {
		// Retrieve class of object
		Class<? extends Object> C=obj.getClass();
		List<String> path= new Vector <String>();
		
		while (C !=null) {
			path.add(0, C.getSimpleName());
			C=C.getSuperclass();
		}
		return path.toString();
	}
	
	private static void printOutProperties(Quark obj) {
		System.out.println("Hierarchy of particlule : " + getObjectPath(obj));
		System.out.println("Class of particlule : " + obj.getClass().getSuperclass().getSimpleName());
		System.out.println("Name : " + obj.getClass().getSimpleName());
		System.out.println("Mass : " + obj.mass + " " + obj.massUnit);
		System.out.println("Charge :" + obj.getChargeS() + "(" + obj.getCharge() + ")");
		System.out.println("Obey to :" + obj.obeyTo);
		System.out.println("Spin : " + obj.spinS + "(" + obj.spin + ")");
		System.out.println("----------------------");
	}
	
}