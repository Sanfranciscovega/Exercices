package com.flafitte.exercices.quanta;

abstract class Boson extends Quanta {
	enum eInteraction {WEAK,STRONG,HIGGS,ELECTROMAGNETIC,GRAVITY};
	public eInteraction interaction;		//weak, strong, gravity ...
}
