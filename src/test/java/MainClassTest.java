import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
	MainClass mainClass = new MainClass();


	@Test
	public void checkLocalNumberTest() {
		int expectedNumber = 14;
		Assertions.assertEquals(expectedNumber, mainClass.getLocalNumber(), "Error, the localNumber's value not is 14");
	}
}
