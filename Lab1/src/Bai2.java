
import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hay nhap chieu dai:");
		int CD = scanner.nextInt();
		System.out.print("Hay nhap chieu rong:");
		int CR = scanner.nextInt();
		int CV = (CD + CR) *2;
		System.out.printf("Chu vi la: " + CV);
		long DT = CD*CR;
		System.out.printf("\nDien tich la: " + DT);
		System.out.printf("\nCanh nho nhat la: %d",Math.min(CR,CD));
	}

}
