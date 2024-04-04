package isa2;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

class Java_Program_to_Add_Two_IntegersTest {

	@Test
    public void testAdditionPositiveNumbers() {
        int num1 = 5;
        int num2 = 10;
        int expectedResult = 15;
        int actualResult = Java_Program_to_Add_Two_Integers.sum(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAdditionNegativeNumbers() {
        int num1 = -8;
        int num2 = -3;
        int expectedResult = -11;
        int actualResult = Java_Program_to_Add_Two_Integers.sum(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}



	