package DAY44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependancy {
	@Test(priority=1)
	void OpenApp() {
		Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods= {"OpenApp"})
	void Login() {
		Assert.assertTrue(true);
	}
	@Test(priority=3)
	void Search1() {
		Assert.assertTrue(true);
	}
	@Test(priority=4)
	void AdvSearch() {
		Assert.assertTrue(true);
	}

}
