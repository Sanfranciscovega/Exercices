package com.flafitte.exercices.quanta;


abstract class Fermion extends Quanta {
	protected String obeyTo="Fermi-Dirac statistic";
	protected enum eGeneration {FIRST, SECOND, THIRD};
	protected eGeneration generation;	

	// TODO : all Fermions have a spin of 1/2
	Fermion() {
		spin=0.5;
		spinS="1/2";
	}
}