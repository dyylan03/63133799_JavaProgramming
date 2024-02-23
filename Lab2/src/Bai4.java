import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		menu();

	}
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\n");
			System.out.print("+---------------------------------------------------------+\n");
			System.out.println("1. Tính PTB1");
			System.out.println("2. Tính PTB2");
			System.out.println("3. Tính Tiền Điện");
			System.out.println("4. Kết thúc");
			System.out.print("+---------------------------------------------------------+");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Nhap a va b");
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				PTB1.thuattoan(a,b);	
				break;
				
			case 2:
				System.out.println("Nhap a va b");
				int a2 = scanner.nextInt();
				int b2 = scanner.nextInt();
				int c2 = scanner.nextInt();
				PTB2.thuattoan(a2,b2,c2);	
				break;
			
			case 3:
				System.out.println("Nhap so dien");
				int soDien = scanner.nextInt();
				TienDien.TienDien(soDien);
				break;
			case 4:
				System.out.println("Ket Thuc");
				return;
			default:
				System.out.println("Lua chon khong hop le");
		}
	}
	}
}
