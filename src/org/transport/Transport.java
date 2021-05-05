package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {

	
	private void TransportForm() {
		// TODO Auto-generated method stub
System.out.println("TRAVELS");

	}
	
	public static void main(String[] args) {
		
		Transport t=new Transport();
		t.TransportForm();
		
		Water w=new Water();
		w.boat();
		w.ship();
		
		Air a= new Air();
		a.aeroPlane();
		a.heliCopter();
		
		Road r=new Road();
		r.bike();
		r.bus();
		r.car();
		r.cycle();
		
		
	}
}
