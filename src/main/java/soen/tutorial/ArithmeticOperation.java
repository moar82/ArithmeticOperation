package soen.tutorial;

public class ArithmeticOperation {

	public Integer addOrSub(Integer a, Integer b)
	{
		if (a > b) {
			return a - b;
		} else {
			return a + b;
		}
	}
}
