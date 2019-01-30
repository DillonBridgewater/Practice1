package apPractice;

public class Runner {
	public static void main(String[] args) {
		int count = 0;
		for (int j = 4; j>9; j++) {
			if (j%2==1)
				count = count+1;
		}
		System.out.println(count);
	}

}
