import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class Bai3{

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Nhap vao phan tu n cua mang:");
			int n = scanner.nextInt();
			Integer[] array = new  Integer[n]; 
			
			System.out.print("Nhap vao cac phan tu cua mang");
			for(int i = 0; i < n; i++) {
				System.out.printf("Nhap vao phan tu thu a[%d]",i);
				array[i] = scanner.nextInt();
			}
			//In mang
			System.out.println("Mang vua nhap: ");
			for(int i = 0; i < n; i++) {
				System.out.printf("array[%d] = %d\n", i, array[i]);
			}
			//in Min
			int Min = array[0];
			for(int i = 0; i < n; i++) {
				Min = Math.min(Min, array[i]);
			}
			System.out.printf("Gia tri nho nhat trong mang:" + Min);
			//Sap xep tang
			Arrays.sort(array);
			System.out.println("\nMang sau khi sap xep tang:");
			for(int i = 0; i < n; i++) {
				System.out.printf("array[%d] = %d\n", i, array[i]);
			}
			//Sap xep giam
			Arrays.sort(array, Collections.reverseOrder());
			
			System.out.println("Mang sau khi sap xep giam:");
			for(int i = 0; i < n; i++) {
				System.out.printf("array[%d] = %d\n", i, array[i]);
			}
			
			//Trung binh cong cac so chia het cho 3
			int sum = 0;
			int count = 0;
			for(int i = 0; i < n; i++) {
				if(array[i] % 3 == 0) {
					sum += array[i];
					count += 1;
				}	
			}
			System.out.printf("Co %d so chia het cho 3", count);
			if(count > 0) {
				double average  = (double) sum / count;
				System.out.printf("\nTrung binh cong cac so chia het cho 3: %.2f", average);
			}else {
				System.out.println("\nKhong co so nao chia het cho 3 trong mang!");
			}
	}
}
