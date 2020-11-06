package fr.lcdlv.test;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class FizzBuzzGeneratorTest {

	FizzBuzzGenerator fizzBuzz;

	private static String FIZZ = "... Fizz ...";
	private static String BUZZ = "... Buzz ...";
	private static String FIZZ_BUZZ = "... Fizz ...... Buzz ...";

	@BeforeEach
	public void init() {
		fizzBuzz = new FizzBuzzGenerator();
	}

	@Test
	public void fizzBuzzNominalCase() {

		Assert.assertEquals("1", fizzBuzz.generateFizzBuzz(1));
		Assert.assertEquals("2", fizzBuzz.generateFizzBuzz(2));
		Assert.assertEquals("4", fizzBuzz.generateFizzBuzz(4));

	}

	@Test
	public void fizzUseCaseTest() {

		Assert.assertEquals(FIZZ, fizzBuzz.generateFizzBuzz(3));
		Assert.assertEquals(FIZZ, fizzBuzz.generateFizzBuzz(37));

	}

	@Test
	public void buzzUseCaseTest() {

		Assert.assertEquals(BUZZ, fizzBuzz.generateFizzBuzz(5));

	}

	@Test
	public void fizzBuzzTest() {

		Assert.assertEquals(FIZZ_BUZZ, fizzBuzz.generateFizzBuzz(15));
		Assert.assertEquals(FIZZ_BUZZ, fizzBuzz.generateFizzBuzz(30));
		Assert.assertEquals(FIZZ_BUZZ, fizzBuzz.generateFizzBuzz(54));
	}

	@Test
	public void fizzBuzzListTest() {
		StringBuilder fizzBuzzBuilder = new StringBuilder();

		boolean isFuzz = false;
		boolean isBuzz = false;

		for (int i = 1; i < 100; i++) {
			String expectedVal = String.valueOf(i);
			isFuzz = i % 3 == 0 || expectedVal.contains("3") ? true : false;
			isBuzz = i % 5 == 0 || expectedVal.contains("5") ? true : false;

			if (isFuzz && isBuzz) {
				expectedVal = FIZZ_BUZZ;
			} else {
				if (isFuzz) {
					expectedVal = FIZZ;
				}
				if (isBuzz) {
					expectedVal = BUZZ;
				}

			}
			String result = fizzBuzz.generateFizzBuzz(i);
			Assert.assertEquals(expectedVal, result);

			fizzBuzzBuilder.append(result).append("\n");
		}
		System.out.println(fizzBuzzBuilder.toString());
	}

}
