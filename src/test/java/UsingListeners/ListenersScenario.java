package UsingListeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listeners_Utility.Listeners.class)
public class ListenersScenario {
	
	@Test
	public void demon()
	{
		System.out.println("Test Execution");
	}
	
}
