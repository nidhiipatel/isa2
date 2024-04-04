package isa2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciSeriesTest {

    @Test
    public void testDisplayFibonacciSeriesWith5Terms() {
        String expectedOutput = "0, 1, 1, 2, 3";
        assertEquals(expectedOutput, getFibonacciSeriesOutput(5));
    }

    private Object getFibonacciSeriesOutput(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
    public void testDisplayFibonacciSeriesWith10Terms() {
        String expectedOutput = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34";
        assertEquals(expectedOutput, getFibonacciSeriesOutput(10));
    }

	}

