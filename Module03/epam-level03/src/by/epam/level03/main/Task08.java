package by.epam.level03.main;

/*
 * Работа со строкой как с объектом типа String или StringBuilder
 * 3. Проверить, является ли заданное слово палиндромом.
 */
public class Task08 {

	public static void main(String[] args) {
		String str = "ABBA";
		int i = 0;
		String newStr = reverseString(str, i);
		if (str.equals(newStr)) {
			System.out.println("This word is polindrom");
		} else {
			System.out.println("The word is NOT polindrom");
		}
	}

	public static String reverseString(String s, int i) {
		char[] c = s.toCharArray();
		String result = "";
		for (i = c.length - 1; i >= 0; i--) {
			result += c[i];
		}
		return result;
	}
}
// This word is polindrom
