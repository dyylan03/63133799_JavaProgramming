import java.util.Scanner;

public class PTB1 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Hay nhap vao gia tri a:");
			int a = scanner.nextInt();
			System.out.print("\nHay nhap vao gia tri b:");
			int b = scanner.nextInt();
			
			thuattoan(a,b);
	}
	public static void thuattoan(int a, int b) {
			if(a==0) {
				if(b==0) {
					System.out.println("Phuong trinh vo so nghiem");
				}else {
					System.out.println("Phuong trinh vo nghiem");
				}
			}else {
				double x =(double) -b/a;
				System.out.printf("Phuong trinh co nghiem: %.2f ", x);
			}
	}
}
