public class Exercise6 {
	public static void main(String[] args) {
		for (int i = 65; i <= 126; i++) {
			if ((i) % 5 == 0) {
				System.out.println();
			}
			System.out.print((char)i + "=" + i + " ");
		}
	}
}