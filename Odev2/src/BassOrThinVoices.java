
public class BassOrThinVoices {
	public static void bassOrThin(char chr) {
		switch (chr) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println("Kalin sesli harf.");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
		case 'e':
		case 'i':
		case 'ö':
		case 'ü':
			System.out.println("Ince sesli harf.");
			break;
		default:
			System.out.println("Sesli harf girmediniz.");
			break;
		}
	}
}
