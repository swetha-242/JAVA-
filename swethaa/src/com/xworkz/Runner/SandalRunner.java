package com.xworkz.Runner;

import com.xworkz.data.SandalData;
import com.xworkz.store.SandalStore;

public class SandalRunner {

	public static void main(String[] args) {
		
		SandalStore data1=new SandalStore();
		data1.display();
		SandalData sandall=new SandalData("puma",'M',150,"white");		
        sandall.show();
        SandalData sandall1=new SandalData("nyka",'F',200,"grey");
        sandall1.show();
        SandalData sandall2=new SandalData("bata",'F',100,"blue");
        sandall2.show();
        SandalData sandall3=new SandalData("rayon",'M',1300,"black");
        sandall3.show();
        SandalData sandall4=new SandalData("esson",'F',500,"brown");
        sandall4.show();
	}

}
