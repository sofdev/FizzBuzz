package fr.lcdlv.bddtest;

import org.junit.jupiter.api.Assertions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.lcdlv.test.FizzBuzzGenerator;



public class FizzBuzzSteps {

	FizzBuzzGenerator fizzBuzz;
	private String fizzBuzzResult;

	@Given("^Jouer FizzBuzz$")
	public void Jouer_FizzBuzz() {
		fizzBuzz = new FizzBuzzGenerator();
	}
		   
	@When("^Quand je joue avec le numero (\\d+)")
	public void Quand_je_joue_avec_le_numero(Integer num) {
		fizzBuzzResult = fizzBuzz.generateFizzBuzz(num);
	}

	@Then("^le resultat est \"([^\"]*)\"$")
	public void le_resultat_est(String result) {
		Assertions.assertEquals(fizzBuzzResult, result);
	}
	
	

}
