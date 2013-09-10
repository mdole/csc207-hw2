package PackageTwoA;

import static org.junit.Assert.*;

import org.junit.Test;

public class RationalNumberTests {

    @Test
    public void test_getNum() {
	assertEquals("negative (abs. val) less than one", -1, RationalNumbers.negativeLess.getNum());
	assertEquals("negative greater than one", -3, RationalNumbers.negativeGreater.getNum());
	assertEquals("positive less than one", 1, RationalNumbers.positiveLess.getNum());
	assertEquals("positive greater than one", 3, RationalNumbers.positiveGreater.getNum());
	assertEquals("zero", 0, RationalNumbers.zero.getNum()));
    }
    @Test
    public void test_getDenom() {
	assertEquals("negative (abs. val) less than one", -2, RationalNumbers.negativeLess.getDenom());
	assertEquals("negative greater than one", -2, RationalNumbers.negativeGreater.getDenom());
	assertEquals("positive less than one", 2, RationalNumbers.positiveLess.getDenom());
	assertEquals("positive greater than one", 2, RationalNumbers.positiveGreater.getDenom());
	assertEquals("zero", 0, RationalNumbers.zero.getDenom());
    }
    @Test
    public void test_multiply() {
	assertEquals("product is negative (abs.val) less than one", -.25, RationalNumbers.negativeLess.multiply(.5));
	assertEquals("product is negative greater than one", -9/2, RationalNumbers.negativeGreater.multiply(3));
	assertEquals("product is positive less than one", .25, RationalNumbers.positiveLess.multiply(.5));
	assertEquals("product is positive greater than one", 9/2, RationalNumbers.positiveGreater.multiply(3));
	assertEquals("anything by zero", 0, RationalNumbers.positiveGreater.multiply(0));
    }
    @Test
    public void test_add() {
	assertEquals("product is negative (abs.val) less than one", 0, RationalNumbers.negativeLess.add(.5));
	assertEquals("product is negative greater than one", -1/2, RationalNumbers.negativeGreater.add(1));
	assertEquals("product is positive less than one", 1, RationalNumbers.positiveLess.add(.5));
	assertEquals("product is positive greater than one", 2, RationalNumbers.positiveGreater.add(.5));
	assertEquals("anything by zero", 3/2, RationalNumbers.positiveGreater.add(0));
    }
    @Test
    public void test_reciprocal() {
	assertEquals("product is negative (abs.val) less than one", -2, RationalNumbers.negativeLess.reciprocal());
	assertEquals("product is negative greater than one", -2/3, RationalNumbers.negativeGreater.reciprocal());
	assertEquals("product is positive less than one", 2, RationalNumbers.positiveLess.reciprocal());
	assertEquals("product is positive greater than one", 2/3, RationalNumbers.positiveGreater.reciprocal());
	assertEquals("anything by zero", 0, RationalNumbers.positiveGreater.reciprocal(0));
    }
    @Test
    public void test_absVal() {
	assertEquals("product is negative (abs.val) less than one", .5, RationalNumbers.negativeLess.absVal());
	assertEquals("product is negative greater than one", 1.5, RationalNumbers.negativeGreater.absVal());
	assertEquals("product is positive less than one", .5, RationalNumbers.positiveLess.absVal());
	assertEquals("product is positive greater than one", 1.5, RationalNumbers.positiveGreater.absVal());
	assertEquals("anything by zero", 0, RationalNumbers.positiveGreater.absVal());
    }
    @Test
    public void test_numeratorExponent() {
	assertEquals("product is negative (abs.val) less than one", -.5, RationalNumbers.negativeLess.numeratorExponent(2));
	assertEquals("product is negative greater than one", -9/2, RationalNumbers.negativeGreater.numeratorExponent(2));
	assertEquals("product is positive less than one", .5, RationalNumbers.positiveLess.numeratorExponent(2));
	assertEquals("product is positive greater than one", 9/2, RationalNumbers.positiveGreater.numeratorExponent(2));
	assertEquals("anything by zero", .5, RationalNumbers.positiveGreater.numeratorExponent(2));
    }
    @Test
    public void test_denominatorExponent() {
	assertEquals("product is negative (abs.val) less than one", -.25, RationalNumbers.negativeLess.denominatorExponent(2));
	assertEquals("product is negative greater than one", -3/4, RationalNumbers.negativeGreater.denominatorExponent(2));
	assertEquals("product is positive less than one", .25, RationalNumbers.positiveLess.denominatorExponent(2));
	assertEquals("product is positive greater than one", 3/4, RationalNumbers.positiveGreater.denominatorExponent(2));
	assertEquals("anything by zero", .5, RationalNumbers.positiveGreater.denominatorExponent(2));
    }
    @Test
    public void test_roundRational() {
	assertEquals("product is negative (abs.val) less than one", -1, RationalNumbers.negativeLess.roundRational());
	assertEquals("product is negative greater than one", -2, RationalNumbers.negativeGreater.roundRational());
	assertEquals("product is positive less than one", 0, RationalNumbers.positiveLess.roundRational());
	assertEquals("product is positive greater than one", 1, RationalNumbers.positiveGreater.roundRational());
    }
    @Test
    public void test_floorRational() {
	assertEquals("product is negative (abs.val) less than one", -1, RationalNumbers.negativeLess.floorRational());
	assertEquals("product is negative greater than one", -2, RationalNumbers.negativeGreater.floorRational());
	assertEquals("product is positive less than one", 0, RationalNumbers.positiveLess.floorRational());
	assertEquals("product is positive greater than one", 1, RationalNumbers.positiveGreater.floorRational());
    }
    @Test
    public void test_ceilingRational() {
	assertEquals("product is negative (abs.val) less than one", 0, RationalNumbers.negativeLess.ceilingRational());
	assertEquals("product is negative greater than one", -1, RationalNumbers.negativeGreater.ceilingRational());
	assertEquals("product is positive less than one", 1, RationalNumbers.positiveLess.ceilingRational());
	assertEquals("product is positive greater than one", 2, RationalNumbers.positiveGreater.ceilingRational());
    }

}
