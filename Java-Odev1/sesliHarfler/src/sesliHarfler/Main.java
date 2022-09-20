package sesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'A';

		switch (harf) {
		case 'A':
		case 'B':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf girdiniz");
		default:
			System.out.println("İnce sesli harf girdiniz");
		}

	}
}
