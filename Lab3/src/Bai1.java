import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hay nhap vao 1 so nguyen duong:");
		int number = scanner.nextInt();
		
		
	if(KT_SNT(number)) {
		System.out.println(number  + "\tla so nguyen to");
	}else {
		System.out.println(number + "\tkhong la so nguyen to");
	}
	scanner.close();
	}
	public static boolean KT_SNT(int n) {
		if(n <=1 ) {
			return false;
		}for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
