
public class Problem2 {

	public static void main(String[] args) {
		System.out.println(this.run());
	}
	
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
