
public class Main {

	public static void main(String[] args) {
		int[][]square1 = new int[][] {
			{1,2,3},
			{2,3,1},
			{3,1,2}
		};
		int[][] square2 = new int[][] {
			{10,30,20,0},
			{0,20,30,10},
			{30,0,10,20},
			{20,10,0,30},
		};
		int[][]square3 = new int[][] {
			{1,2,1},
			{2,1,1},
			{1,1,2}
		};
		int[][] square4 = new int[][] {
			{1,2,3},
			{3,1,2},
			{7,8,9}
		};
		int[][] square5 = new int[][] {
			{1,2},
			{1,2}
		};
		System.out.println(ArrayTester.isLatin(square1));
		System.out.println(ArrayTester.isLatin(square2));
		System.out.println(ArrayTester.isLatin(square3));
		System.out.println(ArrayTester.isLatin(square4));
		System.out.println(ArrayTester.isLatin(square5));
	}

}
