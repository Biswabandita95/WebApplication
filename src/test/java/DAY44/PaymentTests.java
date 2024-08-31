package DAY44;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test(priority=1, groups= {"sanity","regession"})
	void PaymentInRupes()
	{
		System.out.println("Payment in Rupess....");
	}
	@Test(priority=2, groups= {"sanity","regession"})
	void PaymentIndollar()
	{
		System.out.println("Payment in Dollar.");
}
}
