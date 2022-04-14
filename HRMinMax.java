package latihan;

import java.util.Scanner;

public class HRMinMax {
	public static Scanner scan = new Scanner(System.in);
	public static void selisih(int [] arr) {
		int min =arr[0];
		int max =arr[0];
		long jumlah = 0;
		for (int number : arr) {
			jumlah +=number;
			if(number<min) min=number;
			if (number>max) max = number;
		}
		System.out.print((jumlah - max)+" "+ (jumlah-min));
	}
	
	public static void main(String[] args) {
		int [] arr = new int [5];
		String [] arrIsi = scan.nextLine().split(" ");
		
		for (int i = 0; i< 5;i++) {
			int arrBaru = Integer.parseInt(arrIsi[i]);
			arr[i]=arrBaru;
		}
		selisih(arr);
		scan.close();
	}

}
