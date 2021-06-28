package com.cal.Calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Assert; 
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest {

		private App objCalcUnderTest;

		@Before
		public void setUp() {
		//Arrange
		objCalcUnderTest = new App();
		}

		@Test
		public void testAdd() { 
		float a = 15; float b = 20; 
		float expectedResult = 35;
		//Act 
		float result = objCalcUnderTest.add(a, b);
		//Assert
		Assert.assertEquals(expectedResult, result, 0.00005);
		
		}
		
		@Test
		public void testsub() { 
			float a = 15; float b = 20; 
			float expectedResult = -5;
			//Act 
			float result = objCalcUnderTest.subtract(a, b);
			//Assert
			Assert.assertEquals(expectedResult, result, 0.00005);
			
			}
}

