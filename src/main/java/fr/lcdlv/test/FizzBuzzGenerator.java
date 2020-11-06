package fr.lcdlv.test;

public class FizzBuzzGenerator {

	public String generateFizzBuzz(int number) {

		boolean isFizz = number % 3 == 0 || String.valueOf(number).contains("3");
		boolean isBuzz = number % 5 == 0 || String.valueOf(number).contains("5");

		return isFizz ? isBuzz ? "... Fizz ...... Buzz ..." : "... Fizz ..." : isBuzz ? "... Buzz ..." : String.valueOf(number);
	}

}
