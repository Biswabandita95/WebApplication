package DAY44;

import org.testng.annotations.Test;

public class SiginTests {

		@Test(priority=1, groups= {"regression"})
		void SignupByEmail()
		{
			System.out.println("This is Signup by email....");
		}
		@Test(priority=2, groups= {"regression"})
		void SignupByFacebook()
		{
			System.out.println("This is Signup by facebook....");
		}
		@Test(priority=3, groups= {"regression"})
		void SignupBytwitter()
		{
			System.out.println("This is Signup by twitter....");
		}

}
