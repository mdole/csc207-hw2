package PackageTwoA;

public class TwoA {

    /**
     * @param args
     */
    public static boolean isMultiple(long a, long b) {
	if (a==0) {
	    return true;
	}
	else if (b==0) {
	    return false;
	}
	else {
	    double doubleResult = (double) a/b;
	    long longResult = (long) doubleResult;
	    if ((doubleResult - longResult) == 0) {
		return true;
	    }
	    else {
		return false;
	    }
	}
    }

    public static boolean isOdd(int i) {
	if (i > 0){
	    while ((i != 0)&& (i != 1)){
		i = i - 2;
	    }
	}
	else if (i < 0){
	    while ((i != 0)&& (i != 1)){
		i = i + 2;
	    }
	}
	if (i == 0){
	    return false;
	}
	return true;
    }

    public static int oddSumTo(int n) {
	int sum = 0;
	if((n == 0)|| (n < 0)){
	    return 0;
	}
	if (isOdd(n)){
	    n = n - 2;    
	}
	else{
	    n = n - 1;
	}

	while (n != -1){
	    sum = sum + n;
	    n = n - 2;
	}

	return sum;
    }

    public static boolean isOddProd(int [] ints) {
	for(int first = 0; first < (ints.length - 1); first++){
	    for (int second = (first + 1); second < ints.length; second++){
		if (isOdd(ints[first] * ints[second])){
		    return true;}
	    }
	}
	return false;
    }

    public static boolean allDistinct(int [] ints) {
	for(int first = 0; first < (ints.length - 1); first++){
	    for (int second = (first + 1); second < ints.length; second++){
		if(ints[first] == ints[second])
		{
		    return false;
		}
	    }
	}
	return true;
    }
    public static void reverseInts(int [] ints) {
	for (int i = 0; i < (ints.length/2); i++)
	{
	    int temp = ints[(ints.length-i - 1)];
	    int temp2 = ints[i];
	    ints[i] = temp;
	    ints[(ints.length-i - 1)] = temp2;
	}
    }
    public static void printIntArray(int [] ints) {
	for (int i = 0; i < ints.length; i++) {
	    System.out.println(ints[i]);
	}
    } //Written to ensure correctness of the reverseInts with a visual representation
}