        package PackageTwoA;
        
        import static org.junit.Assert.*;
        
        import org.junit.Test;
        
        public class TestTwoA {
        
        @Test
        public void test_isMultiple(void) {
       	for(int i=1; i<50; i++)
       	{
       	assertEquals("a is greater than b", false, TwoA.isMultiple(50, i));
        }
        for(int i=1; i<50; i++)
        {
        assertEquals("basic functionality", true, TwoA.isMultiple((2 * i), 2));
        }
        assertEquals("a is 0", true, TwoA.isMultiple(0, 5));
        assertEquals("b is 0", false, TwoA.isMultiple(5, 0));
        assertEquals("both are 0", true, TwoA.isMultiple(0, 0));
         } 
        @Test
        public void test_isOdd(void) {
        assertEquals("negative even", false, (TwoA.isOdd(-6)));
        assertEquals("negative odd", true, (TwoA.isOdd(-5)));
        assertEquals("positive even", false, (TwoA.isOdd(6)));
        assertEquals("positive odd", true, (TwoA.isOdd(5)));
        assertEquals("zero", false, (TwoA.isOdd(0)));
        assertEquals("MAX_VALUE", true, TwoA.isOdd(Integer.MAX_VALUE));
        }
        @Test
        public void test_oddSumTo(void) {
        assertEquals("n is negative", 0, TwoA.oddSumTo(-1));
        assertEquals("n is 1", 0, TwoA.oddSumTo(1));
        assertEquals("n is a positive even", 25, TwoA.oddSumTo(10));
        assertEquals("n is a positive odd", 16, TwoA.oddSumTo(9));
        }
        @Test
        public void test_isOddProd(void) {
        assertEquals("all numbers odd", true, TwoA.isOddProd([1, 3, 5])));    
        assertEquals("all numbers even", false, TwoA.isOddProd([2, 4, 6]));
        assertEquals("evens, one odd", false, TwoA.isOddProd([2, 4, 6, 1]));
        assertEquals("evens, two or more odds", true, TwoA.isOddProd([2, 4, 6, 1, 3]));
        }
        @Test
        public void test_allDistinct(void) {
        assertEquals("all distinct", true, TwoA.allDistinct([1, 2, -3]))
        assertEquals("some distinct", false, TwoA.allDistinct([-1, 2, 3, 2]))
        assertEquals("none distinct", false, TwoA.allDistinct([2, 2, 2]))
        assertEquals("one", true, TwoA.allDistinct([1]))
        assertEquals("empty", false, TwoA.allDistinct([]))
        }
        @Test
        public void test_reverseInts(void) {
        assertEquals("multiple", [3, 2, 1], TwoA.allDistinct([1, 2, 3]))    
        assertEquals("one", [3], TwoA.allDistinct([3]))  
        assertEquals("empty", [], TwoA.allDistinct([]))    
        }
        }