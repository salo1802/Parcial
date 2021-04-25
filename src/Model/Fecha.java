package Model;

import java.util.Comparator;

import processing.core.PApplet;

public class Fecha implements Comparator<Peluditos>{

	@Override
	public int compare(Peluditos o1, Peluditos o2) {
		return o1.getFechaNA().compareTo(o2.getFechaNA());
	}

}
