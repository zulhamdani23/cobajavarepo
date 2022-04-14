package latihan;

import java.util.Scanner;

public class LD2MetSatuDua {
	public Scanner scan = new Scanner(System.in);

	public int getInput() {
		System.out.print("Masukkan N: ");
		int n = scan.nextInt();
		return n;
	}

	private void fibo(int bil) {
		int n_1 = 1;
		int n_2 = 0;
		int fn = 1;
		for (int i = 0; i < bil; i++) {
			System.out.print(fn);
			fn = n_1 + n_2;
			n_2 = n_1;
			n_1 = fn;
		}
	}

	private void tribo(int bil) {
		int n_1 = 1;
		int n_2 = 1;
		int n_3 = 1;
		int fn = 1;

		for (int i = 0; i < bil; i++) {
			if (i < 2) {
				System.out.print("1 ");
			} else {
				System.out.print(fn + " ");
				fn = n_1 + n_2 + n_3;
				n_3 = n_2;
				n_2 = n_1;
				n_1 = fn;
			}
		}

	}

	public void pola(int bil) {
		System.out.print("Pola: " + "\n1. Fibo" + "\n" + "2. Tribo");
		System.out.print("\nPilih: ");
		int z = scan.nextInt();
		if (z == 1) {
			fibo(bil);
		} else if (z == 2) {
			tribo(bil);
		} else {
			System.out.print("salah");
		}

	}

	public void cetak() {
		boolean cek = true;
		do {
			int bil = getInput();
			pola(bil);
			System.out.print("\nCoba? ");
			String ya = scan.next();
			if (ya.equalsIgnoreCase("y")) {
				cek = true;
			} else {
				cek = false;
			}
		} while (cek);
		scan.close();
		System.out.print("Thank You");
	}

	public static void main(String[] args) {
		LD2MetSatuDua run = new LD2MetSatuDua();
		run.cetak();
	}
}
