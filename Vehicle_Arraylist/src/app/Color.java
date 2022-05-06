package app;

public enum Color 
{
	WHITE(1000), GREY(2000), SILVER(3000), BLACK(2500), RED(4500);

	private double additionalCost;
	
	private Color(double additionalCost) {
		this.additionalCost = additionalCost;
	}
	@Override
	public String toString()
	{
		return name().toLowerCase()+"@"+additionalCost;
	}


	public double getAdditionalCost() {
		return additionalCost;
	}
	

}
