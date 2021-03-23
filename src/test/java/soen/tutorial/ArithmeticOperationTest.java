package soen.tutorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationTest {


	@Test
	public void testAdd()
	{

		ArithmeticOperation operations = new ArithmeticOperation();
		Integer actual = operations.addOrSub(2, 6);
		Integer expected = 8;
		assertEquals(expected, actual);

	}
    @Test
    public void testSub()
    {

        ArithmeticOperation operations = new ArithmeticOperation();
        Integer actual = operations.addOrSub(6, 2);
        Integer expected = 4;
        assertEquals(expected, actual);

    }

}
