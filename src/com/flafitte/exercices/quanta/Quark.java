package com.flafitte.exercices.quanta;

abstract class Quark extends Fermion {
	protected enum eColorCharge {GREEN, RED, BLUE};
	protected eColorCharge colorCharge;		// None or color
	
	
	// Intern static class
	// All known Quarks
	public static class Up extends Quark  {
		Up() throws Exception{
			this.name="up";
			this.symbol="u";
			this.mass=2200000;
			this.setCharge("2/3");
			//this.spin=Fermion.spin;
			this.generation=eGeneration.FIRST;
		}
	}
	
	public static class Down extends Quark {
		Down() throws Exception{
			this.name="down";
			this.symbol="d";
			this.mass=4700000;
			this.setCharge("-1/3");
			this.generation=eGeneration.FIRST;
		}
	}

	public static class Charm extends Quark {
		Charm() throws Exception{
			this.name="charm";
			this.symbol="c";
			this.mass=1280000000;
			this.setCharge("2/3");
			this.generation=eGeneration.SECOND;
		}
 	}
	
	public static class Strange extends Quark {
		Strange() throws Exception{
			this.name="strange";
			this.symbol="s";
			this.mass=96000000;
			this.setCharge("-1/3");
			this.generation=eGeneration.SECOND;
		}
	}

	public static class Top extends Quark {
		Top() throws Exception{
			this.name="top";
			this.symbol="t";
			this.mass=1731000000;
			this.setCharge("2/3");
			this.generation=eGeneration.THIRD;
		}
	}
	
	public static class Bottom extends Quark {
		Bottom() throws Exception{
			this.name="bottom";
			this.symbol="b";
			this.mass=4280000000L;
			this.setCharge("-1/3");
			this.generation=eGeneration.THIRD;
			}

	}
}

