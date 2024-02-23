import java.util.Scanner;
public class TienDien {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so dien da dung: ");
		int soDien = scanner.nextInt();
		TienDien(soDien);
	}
	public static void TienDien(int soDien) {
		if(soDien<50 && soDien == 50) {
			System.out.printf("Tien dien la: "+ soDien*1000);
		}else {
			System.out.printf("Tien dien la:"+ (50*1000 + (soDien-50)*1200));
		}
	}
}
