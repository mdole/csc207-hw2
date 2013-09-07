package PackageTwoA;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA {

//    @Test
//    public void test_isMultiple() {
//	for(long i=1; i<51; i++)
//	{
//	    assertEquals("b is greater than a", false, TwoA.isMultiple(i, 51));
//	}
//	for(long i=Integer.MIN_VALUE; i<Integer.MAX_VALUE; i++)
//	{
//	    assertEquals("values of a between the min and max values (including 0)", true, TwoA.isMultiple((2 * i), 2));
//	}
//	for(long i=Integer.MIN_VALUE; i<Integer.MAX_VALUE; i++)
//	{
//	    assertEquals("values of b between the min and max values (including 0)", true, TwoA.isMultiple((4 * i), (2 *i)));
//	}
//	assertEquals("b is 0 and a is not", false, TwoA.isMultiple(5, 0));
//    }


    @Test
    public void test_isOdd() {
	assertEquals("negative even", false, (TwoA.isOdd(-6)));
	assertEquals("negative odd", true, (TwoA.isOdd(-5)));
	assertEquals("positive even", false, (TwoA.isOdd(6)));
	assertEquals("positive odd", true, (TwoA.isOdd(5)));
	assertEquals("zero", false, (TwoA.isOdd(0)));
	assertEquals("100,000", false, TwoA.isOdd(100000));
    }

    
    @Test
    public void test_oddSumTo() {
	assertEquals("n is negative", 0, TwoA.oddSumTo(-1));
	assertEquals("n is 1", 0, TwoA.oddSumTo(1));
	assertEquals("n is a positive even", 25, TwoA.oddSumTo(10));
	assertEquals("n is a positive odd", 16, TwoA.oddSumTo(9));
    }

    
    @Test
    public void test_isOddProd() {
	int [] allNumOdd = { 1, 3, 5};
	int [] allNumEven = { 2, 4, 6};
	int [] evens1Odd = { 2, 4, 6, 1};
	int [] evens2Odd = { 2, 4, 6, 1, 3};
	assertEquals("all numbers odd", true, TwoA.isOddProd(allNumOdd));    
	assertEquals("all numbers even", false, TwoA.isOddProd(allNumEven));
	assertEquals("evens, one odd", false, TwoA.isOddProd(evens1Odd));
	assertEquals("evens, two or more odds", true, TwoA.isOddProd(evens2Odd));
    }

    
    @Test
    public void test_allDistinct() {
	int [] allDist = {1, 2, -3};
	int [] someDist = {-1, 2, 3, 2};
	int [] noneDist = {2, 2, 2};
	int [] single = {1};
	int [] empty = {};
	assertEquals("all distinct", true, TwoA.allDistinct(allDist));
	assertEquals("some distinct", false, TwoA.allDistinct(someDist));
	assertEquals("none distinct", false, TwoA.allDistinct(noneDist));
	assertEquals("one", true, TwoA.allDistinct(single));
	assertEquals("empty", true, TwoA.allDistinct(empty));
    }
}
    /*
    @Test
    public void test_reverseInts(void) {
	assertEquals("multiple", [3, 2, 1], TwoA.allDistinct([1, 2, 3]))    
	assertEquals("one", [3], TwoA.allDistinct([3]))  
	assertEquals("empty", [], TwoA.allDistinct([]))    
    }
}
    */