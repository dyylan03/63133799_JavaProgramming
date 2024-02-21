import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hay nhap a, b, c:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.printf("delta = %.2f", Math.pow(b, 2)-4*a*c );
	}

}
