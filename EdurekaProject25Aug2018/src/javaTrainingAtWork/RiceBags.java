package javaTrainingAtWork;

public class RiceBags {
	
	public int calculateRiceBags(int big,int small, int goal) {
	int result = -1;
	if (big * 5 >= goal) {
	    if (small >= goal % 5)
	        result = goal % 5;
	} else {
	    if (small >= goal - big * 5) {
	        result = goal - big * 5;
	    }
	}
	return result;

}
}
