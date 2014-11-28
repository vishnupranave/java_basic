public class ArraysDemo {

	public static void main(String[] args) {
		// Single dimensional Array
		String colors[] = { "Red", "Blue", "Green", "Orange", "Yellow",
				"White", "Black" };
		System.out.println("One dimensional Array");
		for (String s : colors) {
			System.out.println("Color : " + s);
		}
		System.out.println("Color length = " + colors.length);
		float values[] = { 1.0f, 2.5f, 6.0f, 45f, 9f, 3.1f };
		for (float f : values) {
			System.out.println("Value : " + f);
		}
		System.out.println("Value length = " + values.length);

		// Two dimensional Array
		int matrix[][] = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				matrix[i][j] = i + j;
		System.out.println("\nTwo dimensional Array");
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + "\t");
			}

			// Multidimensional Arrays

			int x[][] = new int[3][];
			x[0] = new int[3];
			x[1] = new int[1];
			x[2] = new int[2];
			x[0][0] = 00;
			x[0][1] = 01;
			x[0][2] = 02;
			x[1][0] = 10;
			x[2][0] = 20;
			x[2][1] = 21;
			System.out.println("\nMultidimensional Arrays");
			for (int z = 0; z <x.length; z++) {
				System.out.println();
				for (int k = 0; k < x[z].length; k++)
					System.out.print(x[z][k] + "\t");
			}

		}
	}

}
