import java.util.Scanner;
public class PTB2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao a, b, c:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		thuattoan(a,b,c);
	}
	public static void thuattoan(int a, int b, int c) {
		if(a==0) {
			PTB1.thuattoan(a,b);
		}else {
			double delta = (double)Math.pow(b, 2)-4*a*c;
			if(delta < 0) {
				System.out.print("PTVN");
			}else {
				if(delta == 0){
					System.out.printf("PT co nghiem kep x:  "+ -b/(2*a));
				}else {
					if(delta > 0) {
						System.out.printf("Co 2 nghiem phan biet:X1 %.2f và X2 %.2f", ((-b+ Math.sqrt(delta))/(2*a)),((-b - Math.sqrt(delta))/(2*a)));
					}
				}
				
			}
		}
	}
}
