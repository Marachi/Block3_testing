package com.test;

import org.junit.Before;
import org.junit.Test;
import com.company.*;


import static org.junit.Assert.*;


public class SquareEquationTest {
        public  static  final double ACCURACY = 1e-10;
    SquareEquation oneMore;
    @Before
          public   void before(){
        oneMore = new SquareEquation(1,1,1);
    }

    @Test
   public void setting(){
        oneMore.setCoefficientA(1).setCoefficientB(1).setCoefficientC(1);
    }
    @Test
    public void testTwoRoots() throws Exception {
        SquareEquation eq = new SquareEquation(1., -5, 6.);
        double [] result = eq.solve();
        assertNotNull(result);
        assertEquals("Have to be 2 roots", result.length,2);
        double min = result[0]<result[1]?result[0]:result[1];
        double max = result[0]>result[1]?result[0]:result[1];
        assertEquals("First root", 2. , min, ACCURACY);
        assertEquals("Second root", 3. , max, ACCURACY);

    }
    @Test
    public void testOneRoot(){
        SquareEquation sq = new SquareEquation(2,4,2);
        double res[]= sq.solve();
        assertArrayEquals(new double[]{-1}, res, ACCURACY);
    }
    @Test
    public void testNoRoots(){
        SquareEquation eq = new SquareEquation(1 , 1, 10);
        double [] res = eq.solve();
        assertEquals(0, res.length);
    }
    @Test(expected = IllegalArgumentException.class)
    public void notSqSquareEquation(){

        SquareEquation eq = new SquareEquation(0,4,10);
        eq.solve();
    }


}