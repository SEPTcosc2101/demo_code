package cucumber_calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

class PlusOperator {
	static Integer plus(Integer a, Integer b) {
		return a+b;
	}
}

public class StepDefinitions {
	private Integer left;
	private Integer right;
	private Integer answer;
	@Given("{int} and {int}")
	public void and(Integer int1, Integer int2) {
		this.left = int1;
		this.right = int2;
	}
	//Some other steps were also undefined:

	@When("I add them up")
	public void i_add_them_up() {
		answer = PlusOperator.plus(left, right);
	}
	@Then("I should get {int}")
	public void i_should_get(Integer int1) {
		assertEquals(int1, answer);
	}
}
