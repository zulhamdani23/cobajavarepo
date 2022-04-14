package latihan;

public class PolaDeret {
	public String [] polaSatu(int n) {
		String[] array = new String[n];
		char c ='a';
		if (n % 2 != 0) {
			int medOdd = (n + 1) / 2;
			for (int i = 0; i < n; i++) {
				if (i < medOdd - 1) {
					array[i] = String.valueOf(c++);
				} else {
					array[i] = String.valueOf(c--);
				}
			}
		} else {
			int medEven = n / 2;
			for (int i = 0; i < n; i++) {
				if (i < medEven - 1) {
					array[i] = String.valueOf(c++);
				} else if (i == medEven-1) {
					array[i] = String.valueOf(c);
				} else {
					array[i] = String.valueOf(c--);
				}
			}
		}
		return array;
	} 
	
	public String [] polaDua(int n) {
		String[]array = new String[n];
		char c='a';
		int bil1=0, bil2=1, bilNow=1;
		for (int i=0; i<n; i++) {
			if (i%2 == 0) {
				array[i]= Integer.toString(bilNow);
				bilNow = bil1 + bil2;
				bil1 = bil2;
				bil2 = bilNow;
			} else {
				array[i] = Character.toString(c++); 
			}
			
		}
		return array;
	}
}
