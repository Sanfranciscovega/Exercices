package com.flafitte.exercices.quanta;

import com.flafitte.utils.utils;

abstract class  Quanta {
	protected String name;			// Up, photon ...
	protected String symbol;			// U, Y ...
	
	private String chargeS;			// 1/3, -1/3
	private double charge;			// 0.33,-0.33
	
	protected long mass;			// en eV/c²
	protected final String massUnit="eV/c²";
	
	protected float waveLength;	
	
	protected Quanta anti;			// AntiUp, AntiPhoton
	
	protected String spinS;			// 1/2,1
	protected double spin;			// 0.5,1
	
	protected float timeToLive;		//
	
	protected Quanta interactWith;	// boson W+, Z°

	// Set charge, change fraction to double
	protected void setCharge(String charge) throws Exception {
		double c=utils.fractionToDouble(charge);
		if ( c != 0.0) {
			this.charge=c;
			this.chargeS=charge;
		}
	}

	public double getCharge() {
		return charge;
	}
	
	public String getChargeS() {
		return chargeS;
	}


}

;