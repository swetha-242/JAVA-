package com.xworkz.store;

import com.xworkz.data.SidedishData;

public class SidedishStore {
	
	private SidedishData[] datas=new SidedishData[5];
	private int index=0;
	
	public void save(SidedishData data)
	{
		this.datas[this.index]=data;
		this.index++;
	}
	
	public void display()
	{
		System.out.println("the datas displayed are:");
		for(SidedishData ref:this.datas)
		{
			//System.out.println(data);it gives output as null for 5 datas
		    System.out.println("the dates contains are:"+this.datas);//this gives string representation for the datas
			//to avoid null pointer exception if statement is used
			if(ref!=null)
			{
				ref.show();
			}
			else
			{
				System.out.println("data is null");
			}
		}
	}

}
