
public class CashRegister {
	
	private double purchases;
	private double payment;
	
	private double item1 = 1.82;
	private double item2 = 2.00;
	private double item3 = 1.69; 
	private double item4 = 999.99;
	
	
	/**
	 * Constructor that resets the purchased and payment amount
	 */
	public CashRegister()
	{
		purchases = 0;
		payment = 0;
	}
	
	
	/**
	 * Method for entering the payment from the user
	 * @param unitCount The amount of item being inputed
	 * @param type The type of currency that is inputed
	 */
	public void enterPayment( int unitCount, MonetaryUnit type)
	{
		payment = payment + unitCount*type.getValue();	
	}
	
	/**
	 * Method that returns how much money is over paid
	 * @return An amount the customer gets back
	 */
	public double giveChange()
	{
		return (payment - purchases);
	}

	/**
	 * Method that records what item the customer picks
	 * @param amount The choice that the user picks
	 */
	public void recordPurchase(double amount)
	{
		if(amount == 1)
		{
			purchases  =  item1;
		}else
			if (amount == 2)
			{
				purchases = item2;
			}else
				if(amount == 3)
				{
					purchases = item3;
				
				}else
					if(amount == 4)
					{
						purchases = item4;
					}
					else
						System.out.println("Invalid");
	}
	
	/**
	 * Get method for the purchased amount
	 * @return Variable containing the price of an item
	 */
	public double getPurchases()
	{
		return purchases;
	}
	
	/**
	 * Get method for how much the customer paid
	 * @return Variable of how much was paid by the customer
	 */
	public double getPayment()
	{
		return payment;
	}
	
	/**
	 * Method to print out the prices and product
	 */
	public void menu()
	{
		System.out.println("Select the product you want by inputting the #");
		System.out.println("1: Banana $" + item1);
		System.out.println("2: Water $" + item2);
		System.out.println("3: Apple Juice $" +item3);
		System.out.println("4: Celery Juice $" + item4);
	}
	
	/**
	 * Method to convert the selection choice into a currency type
	 * @param select The coin inputed into the machine
	 * @return The currency name
	 */
	public String convert(int select)
	{
		if (select == 1)
		{
				return "dollar bill";
			}else
				if(select == 0.25)
				{
					return "quarter";
				}else
					if(select == .1)
					{
						return "dime";
					}else
						if(select == 0.05)
							return "nickel";
						else
							return "penny";					
	}
}
