package by.epam.level03.main;

/*
 * Работа со строкой как с объектом типа String или StringBuilder
 * 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых 
   длинных слов может быть несколько, не обрабатывать.
 */
public class Task13 {

	public static void main(String[] args) {
		String s = " The   water is   cold ";
		String str = s.replaceAll("\\s+", " ");
		String[] str1 = str.split(" ");
		int max = 0;
		int maxIndex = 0;
		int count = 0;
		for (int i = 0; i < str1.length; i++) {
			if (max < str1[i].length()) {
				max = str1[i].length();
				maxIndex = i;
			}
		}
		for (int j = 0; j < str1.length; j++) {
			if (max == str1[j].length()) {
				count++;
			}
			if (count > 1)
				break;
		}
		if (count == 1) {
			System.out.println("Result is word  - " + str1[maxIndex]);
		}
	}
}
// Result is word  - water

