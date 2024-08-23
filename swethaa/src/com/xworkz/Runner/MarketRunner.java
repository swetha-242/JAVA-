package com.xworkz.Runner;

import com.xworkz.data.MarketData;
import com.xworkz.store.MarketStore;

public class MarketRunner {

	public static void main(String[] args) {
		
		MarketStore data1=new MarketStore();
		data1.display();
		MarketData mar=new MarketData("APMC","shivamogga");		
		mar.show();
        MarketData mar1=new MarketData("rcc","bengaluru");
        mar1.show();
        MarketData mar2=new MarketData("KMP","bidar");
        mar2.show();
        MarketData mar3=new MarketData("k market","hubli");
        mar3.show();
        MarketData mar4=new MarketData("AR market","shugaav");
        mar4.show();

	}

}
