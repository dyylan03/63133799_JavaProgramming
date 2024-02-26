import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so sinh vien: ");
		int n = scanner.nextInt();
		Integer[] array = new Integer[n];
		
		scanner.nextLine();
		
		String[] hoTen = new String[n];
		double[] diem = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Nhap ho ten sinh vien: ", i);
			hoTen[i] = scanner.nextLine();
			System.out.printf("Nhap vao diem cua sinh vien: ", i);
			diem[i] = scanner.nextDouble();
			scanner.nextLine();
		}
		
		System.out.println("\nThong tin sinh vien: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("Sinh vien %d : Ho va Ten: %s - Diem: %.2f\n",(i+1), hoTen[i], diem[i]);
		}
		 
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n -i- 1; j++) {
				if(diem[j]> diem[j+1]) {
					double tempDiem = diem[j];
					diem[j] = diem[j+1];
					diem[j+1] = tempDiem;
					
					String tempHoTen = hoTen[j];
					hoTen[j] = hoTen[j+1];
					hoTen[j+1] = tempHoTen;
				}
			}
		}
		
		System.out.println("\nDanh sach sinh vien sau khi sap xep theo diem: ");
		for(int i = 0; i < n; i++) {
			System.out.printf("Sinh vien: %d : Ho va Ten: %s - Diem: %.2f\n", (i+1), hoTen[i], diem[i]);
		}
	}

}
