import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class MainClassTest {
	MainClass mainClass = new MainClass();


	@Test
	public void testGetClassString() {
		assertAll(
				"The string not contains expected word",
				() -> assertTrue(mainClass.getClassString().contains("Hello")),
				() -> assertTrue(mainClass.getClassString().toLowerCase(Locale.ROOT).contains("hello"))
		);
	}

	@Test
	public void testGetClassNumber() {
		int expectedNumber = 45;
		assertTrue(mainClass.getClassNumber() > expectedNumber, "Error, the classNumber's value is less than 45");
	}

	@Test
	public void checkLocalNumberTest() {
		int expectedNumber = 14;
		assertEquals(expectedNumber, mainClass.getLocalNumber(), "Error, the localNumber's value not is 14");
	}
}
