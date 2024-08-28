package com.inheritence.datatypes;

import com.inheritence.datatypes.things.Ganesh;
import com.inheritence.datatypes.things.Hat;
import com.inheritence.datatypes.things.Sudeep;
import com.inheritence.datatypes.things.Puneeth;

public class HatGanSudPunRunner {

	public static void main(String[] args) {
		
		
		Ganesh ganesh=new Ganesh();
		ganesh.wear();//-->Hat-->shade(),color
		
		Sudeep sudeep=new Sudeep();
		Hat hat=new Hat();
		sudeep.tear(hat);
		
		Puneeth puneeth=new Puneeth();
		Hat hat1=new Hat();
	    puneeth.hat=hat1;
		// or puneeth.hat=new Hat();
	    
		puneeth.fold();
	}

}
