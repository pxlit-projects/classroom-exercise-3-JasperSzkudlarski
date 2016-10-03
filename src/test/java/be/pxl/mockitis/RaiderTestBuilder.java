package be.pxl.mockitis;

import java.util.ArrayList;
import java.util.List;

public class RaiderTestBuilder {

	private Boolean hasLegendary;
	private List<Raider> actualRaiders = new ArrayList<Raider>();
	
	public Raiders build()
	{
		Raiders raiders = new Raiders(hasLegendary);
		actualRaiders.forEach(raiders::addAttacker);
		return raiders;
	}
	
	public RaiderTestBuilder hasLegendary(Boolean hasLegendary)
	{
		this.hasLegendary = hasLegendary;
		return this;
	}
	
	public RaiderTestBuilder numberOfRaiders(int number)
	{
		actualRaiders.clear();
		for(int i = 0 ; i<number;i++)
		{
			actualRaiders.add(new Raider());
		}
		return this;
	}
}
