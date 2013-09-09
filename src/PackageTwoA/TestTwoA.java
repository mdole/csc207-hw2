package PackageTwoA;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA {

    @Test
    public void test_isMultiple() {
	for(long i=1; i<51; i++)
	{
	    assertEquals("b is greater than a", false, TwoA.isMultiple(i, 51));
	}
	for(long i=-100000; i<100000; i++)
	{
	    assertEquals("values of a between -100,000 and 100,000 (including 0)", true, TwoA.isMultiple((2 * i), 2));
	}
	for(long i=-100000; i<100000; i++)
	{
	    assertEquals("values of b between the -100,000 and 100,000 (including 0)", true, TwoA.isMultiple((4 * i), (2 *i)));
	}
	assertEquals("b is 0 and a is not", false, TwoA.isMultiple(5, 0));
    }
    //Note: We originally implemented the second and third "for" loops for all values of a and b (respectively) between the max and
    //min values the machine is capable of storing. However, due to the significant run time necessary to do so, we deemed it
    //prudent to change them to values between -100,000 and 100,000


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

    @Test
    public void test_reverseInts() {
	int [] multiple = {3, 2, 1};
	int [] reversedMultipleTest = {1, 2, 3};
	int [] one = {3};
	int [] reversedOne = {3};
	int [] empty = {};
	int [] reversedEmpty = {};
	TwoA.reverseInts(multiple);
	TwoA.reverseInts(one);
	TwoA.reverseInts(empty);
	assertArrayEquals("multiple", reversedMultipleTest, multiple);    
	assertArrayEquals("one", reversedOne, one);  
	assertArrayEquals("empty", reversedEmpty, empty);    
    }

    @Test
    public void test_TwoB() {
	assertEquals("positive ints", 5, TwoB.average(6, 4));
	assertEquals("negative ints", -5, TwoB.average(-6, -4));
	assertEquals("positive and negative ints", 0, TwoB.average(-5, 5));
	assertEquals("results in non-whole", 5, TwoB.average(7, 4));
	assertEquals("results in negative non-whole", -5, TwoB.average(-7, -4));
	assertEquals("positive and negative ints that result in non-whole", -2, TwoB.average(-6, 2));
	assertEquals("results in 0", 0, TwoB.average(-1, 1));
	assertEquals("left is 0", 0, TwoB.average(0, 1));
	assertEquals("right is 0", 0, TwoB.average(-1, 0));
	assertEquals("both are 0", 0, TwoB.average(0, 0));
	assertEquals("large value", (Integer.MAX_VALUE / 2), TwoB.average(0, Integer.MAX_VALUE));
	assertEquals("small value", (Integer.MIN_VALUE / 2), TwoB.average(0, Integer.MIN_VALUE));
	assertEquals("large and small value", 0, TwoB.average(Integer.MIN_VALUE+12, Integer.MAX_VALUE-10));
	assertEquals("large value, not max", ((Integer.MAX_VALUE-10) / 2), TwoB.average(0, Integer.MAX_VALUE-10));
	assertEquals("max value and max value", Integer.MAX_VALUE
		, TwoB.average(Integer.MAX_VALUE, Integer.MAX_VALUE));
	assertEquals("min value and min value", Integer.MIN_VALUE
		, TwoB.average(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}