
public class MonetaryUnit {

	
	private double value;
	private String name;
	
	/**
	 * Constructor 
	 * @param value The currency amount
	 * @param name The name of the currency
	 */
	public MonetaryUnit(double value, String name)
	{
		this.value = value;
		this.name = name;
	}
	
	/**
	 * Method to return the value of the currency
	 * @return The value of the currency
	 */
	public double getValue()
	{
		return value;
	}
		
	/**
	 * Method to get the name of the Currency
	 * @return The name of the currency
	 */
	public String getName()
	{
		return name;
	}
}
