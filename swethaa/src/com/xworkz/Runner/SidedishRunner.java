package com.xworkz.Runner;

import com.xworkz.data.SidedishData;
import com.xworkz.store.SidedishStore;

public class SidedishRunner {

	public static void main(String[] args) {
		
		SidedishStore data1=new SidedishStore();
		data1.display();
		SidedishData sd=new SidedishData("Pakoda",50,"Veg");		
		sd.show();
		SidedishData sd1=new SidedishData("egg curry",70,"Non veg");
		sd1.show();
        SidedishData sd2=new SidedishData("gobi",36,"Veg");
        sd2.show();
        SidedishData sd3=new SidedishData("Panipuri",60,"veg");
        sd3.show();
        SidedishData sd4=new SidedishData("chicken lollipop",100,"NonVeg");
        sd4.show();
	}

}
