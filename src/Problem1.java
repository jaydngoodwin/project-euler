
public class Problem1 extends EulerSolution{
	
	public String run() {
		int sum = 0;
		for (int i = 0; i < 1000; i++ ) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return Integer.toString(sum);
	}
	
}
