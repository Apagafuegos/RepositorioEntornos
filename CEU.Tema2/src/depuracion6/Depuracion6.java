package depuracion6;

public class Depuracion6 {
	public static void main(String[] args) {
		int producto;
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				producto = i * j;
				System.out.println(i + " * " + j + " = " + producto);
			}
			System.out.println();
		}
	}
}
