import java.util.Scanner;
public class BangCuuChuong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao 1 so nguyen n: ");
		int number = scanner.nextInt();
		bangCuuChuong(number);
	}
	public static void bangCuuChuong(int n) {
		for(int i = 1; i <=n ; i++) {
			for(int j = 1; j <=10 ;j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
}
