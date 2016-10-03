package be.pxl.mockitis;

import java.util.ArrayList;
import java.util.List;

public class SettlementTestBuilder {
	
	List<Settler> settlers = new ArrayList<Settler>();
	
	public SettlementTestBuilder AmountOfPlebs(int number)
	{
		for(int i=0;i<number;i++)
		{
			settlers.add(new Settler(false));
		}
		return this;
	}
	
	public SettlementTestBuilder AmountOfDefenders(int number)
	{
		for(int i=0;i<number;i++)
		{
			settlers.add(new Settler(true));
		}
		return this;
	}
	
	public Settlement build()
	{
		return new Settlement(settlers);
	}

}
