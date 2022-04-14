package latihan;

import java.util.Scanner;

public class UlangDua {
	public Scanner scan = new Scanner(System.in);

	public int getInput() {
		System.out.print("Masukkan angka: ");
		int bilangan = scan.nextInt();
		scan.close();
		return bilangan;
	}

	public void cetakArr() {
		int n = getInput();
		PolaDeret pola = new PolaDeret();
		String[] polaSatu = pola.polaSatu(n);
		String[] polaDua = pola.polaDua(n);
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					if (j <= i) {
						System.out.printf("%3s",polaSatu[j]);
					} else {
						System.out.printf("%3s"," ");
					}
				} 
				System.out.println("");	
			} else {
				int k = 0;
				for (int j = 0; j < n; j++) {
					if (j <= ((n - i) - 2)) {
						System.out.printf("%3s"," ");
					} else {
						System.out.printf("%3s",polaDua[k]);
						k++;
					}
				}
			}System.out.println();	
		}
	}

	public static void main(String[] args) {
		UlangDua run = new UlangDua();
		run.cetakArr();
	}
}
