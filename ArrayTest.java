package Day1;

public class ArrayTest {

	// Method to Print 2D Array in Sprial Form
	public void printSpiral(int sizeX, int sizeY, int input[][]) {
		int i, l, r;

		l = 0;
		r = 0;
		sizeX--;
		sizeY--;

		while (l <= sizeX && r <= sizeY) {

			for (i = 0; i <= sizeY - l; i++) {
				System.out.print(input[l][i] + " ");
			}

			l++;

			for (i = l; i <= sizeX; i++) {
				System.out.print(input[i][sizeY - r] + " ");
			}

			for (i = sizeX; i >= l; i--) {
				System.out.print(input[i][sizeY - l] + " ");
			}

			r = r + 2;

			for (i = sizeY - r; i >= 0; i--) {
				System.out.print(input[l][i] + " ");
			}

			l++;

		}

	}

	public static void main(String arg[]) {
		ArrayTest at = new ArrayTest();
		int Matrix[][] = new int[][] { { 1, 2, 3, 4, 23 },
				{ 12, 11, 10, 5, 24 }, { 13, 14, 9, 6, 35 },
				{ 16, 15, 8, 7, 56 }, };
		at.printSpiral(4, 5, Matrix);
	}

}
