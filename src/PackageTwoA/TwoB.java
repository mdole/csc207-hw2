package PackageTwoA;

//Preconditions: the sum of left and right must not exceed Integer.MAX_VALUE or
//be less than Integer.MIN_VALUE


public class TwoB {
    /**
     * Compute the average of two integers.  Rounds toward zero if the
     * average is not a whole number.
     */
    public static int average(int left, int right) {
	double avLeft = (double) left/2.0;
	double avRight = (double) right/2.0;
        return (int) (avLeft + avRight);
    } // average(int,int)
} // class TwoB

//Error: this function does not work as expected if 
//the sum of left and right is greater than 
//Integer.MAX_VALUE or less than Integer.MIN_VALUE 
//since the computer cannot perform operations
// on a number greater than the maximum storable
//value or less than the minimum storeable value.
//We have created preconditions that specify that the sum
//of left and right must be less than Integer.MAX_VALUE
//and greater than Integer.MIN_VALUE.
