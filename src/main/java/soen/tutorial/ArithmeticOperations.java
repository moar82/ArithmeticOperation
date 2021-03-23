package soen.tutorial;

public class ArithmeticOperations {

	public Integer addOrSub(Integer a, Integer b)
	{
		if (a > b) {
			return a - b;
		} else {
			return a + b;
		}
	}
}
