package by.epam.level03.main;

/*
 * Работа со строкой как с объектом типа String или StringBuilder
 * 9.Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские 
   буквы
 */
public class Tssk14 {

	public static void main(String[] args) {
		String str = "I am Going to Learn Java";
		char[] c = str.toCharArray();
		int countUp = 0;
		int countLow = 0;
		System.out.println("Number of capital letters is " + searchUpletter(c));
		System.out.println("Number of small letters is " + searchLowLetter(c));

	}

	public static int searchUpletter(char[] c) {
		int countUp = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'A' && c[i] <= 'Z') {
				countUp++;
			}
		}
		return countUp;
	}

	public static int searchLowLetter(char[] c) {
		int countLow = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'a' && c[i] <= 'z') {
				countLow++;
			}
		}
		return countLow;
	}
}
// Number of capital letters is 4
// Number of small letters is 15
