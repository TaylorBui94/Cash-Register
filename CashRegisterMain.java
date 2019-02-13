/**
 * Lab Assignment 2
 * Simulates a vending machine
 * @author Taylor Bui
 * @Since 09-10-18
 *
 */

import java.util.Scanner;

public class CashRegisterMain{
	public static void main(String[] args)
	{		
		String money = "0";		
		CashRegister myRegister = new CashRegister();
		
		Scanner x = new Scanner(System.in);
		
		myRegister.menu();
		double choice = x.nextDouble();
		myRegister.recordPurchase(choice);	
		System.out.println("Your total is $" + myRegister.getPurchases());
	
		while(myRegister.giveChange() < 0 )
		{
			// for test input  1 1 .25 3 .05 2
			System.out.println("Insert money");
			System.out.println("What coin/bill are you inputting? 1 .25 .1 .05 0.1 .01 ");
			double value = x.nextDouble();
			
			System.out.println("How many $" + value + " are you inputting?");
			int many = x.nextInt();
			money =myRegister.convert(many);
			myRegister.enterPayment(many, new MonetaryUnit(value,money));
			System.out.println("Your total inputed is $" + myRegister.getPayment() + ". The total bill is $" + myRegister.getPurchases());
		}
		double myChange = myRegister.giveChange();
		System.out.println("Change: " + myChange);
		System.out.println("Expected : 0.03:");
		
	}
}	
