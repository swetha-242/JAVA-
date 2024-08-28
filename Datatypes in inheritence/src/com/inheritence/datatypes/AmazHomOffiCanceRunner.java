package com.inheritence.datatypes;

import com.inheritence.datatypes.things.Amazon;
import com.inheritence.datatypes.things.Cancel;
import com.inheritence.datatypes.things.Home;
import com.inheritence.datatypes.things.Office;

public class AmazHomOffiCanceRunner {

	public static void main(String[] args) {
		
		Home home=new Home();
		home.deliver();
		
		Office office=new Office();
		Amazon amazon=new Amazon();
		office.parcel(amazon);
		
		Cancel cancel=new Cancel();
		Amazon amazon1=new Amazon();
        cancel.amazon=amazon1;
        cancel.returnn();
	}

}
